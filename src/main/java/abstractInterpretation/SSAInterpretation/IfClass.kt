package abstractInterpretation.SSAInterpretation

import abstractInterpretation.ElseConsumer

class IfClass : ElseConsumer {
    val captures = ArrayList<SSAVariable>()
    var startOfJoins = 0
    var branchInstruction = 0

    constructor(condition: SSABool, ifLambda : ()->Unit) {
        SSACode.addInstruction(SSAOperation.BRANCHIFNOT, condition)
        branchInstruction = SSACode.size-1
        Snapshot.takeSnapshot()
        ifLambda()
        Snapshot.setCacheingOff()
        startOfJoins = SSACode.size
        SSACode[branchInstruction].operand1 = startOfJoins
        captures.addAll(Snapshot.modifiedVars.asSequence())
        captures.forEach {v ->
            SSACode.addInstruction(SSAOperation.JOIN, SSAVariable(v.revert()), SSAVariable(v.id))
            v.id = SSACode.size-1
        }
    }

    override infix fun Else(elseLambda : ()->Unit) {
        val joins = HashMap<SSAVariable,SSAInstruction>()
        captures.forEach {v ->
            joins[v] = SSACode[v.id]
            v.id = SSACode[v.id].operand2
        }
        while(SSACode.size > startOfJoins) SSACode.removeAt(SSACode.size-1)
        SSACode.addInstruction(SSAOperation.GOTO, 0)
        val thenGotoInstruction = SSACode.size-1
        SSACode[branchInstruction].operand1 += 1
        elseLambda()
        SSACode[thenGotoInstruction].operand2 = SSACode.size
        joins.forEach {ssaVar ,joinInstruction ->
            joinInstruction.operand2 = ssaVar.id
            ssaVar.id = SSACode.size
            SSACode.add(joinInstruction)
        }
    }
}

//infix fun (()-> Unit).Else(elseLambda : ()->Unit) : Pair<()->Unit,()->Unit> {
//    return Pair(this, elseLambda)
//}
