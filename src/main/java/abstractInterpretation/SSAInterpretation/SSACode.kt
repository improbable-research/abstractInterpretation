package abstractInterpretation.SSAInterpretation

object SSACode : ArrayList<SSAInstruction>() {
    fun addInstruction(operation : SSAOperation, operand1 : SSAVariable, operand2 : SSAVariable) : Int {
        add(SSAInstruction(operation, operand1, operand2))
        return size-1
    }

    fun addInstruction(operation : SSAOperation, operand1 : SSAVariable) : Int {
        add(SSAInstruction(operation, SSAVariable(0), operand1))
        return size-1
    }

    fun addInstruction(operation : SSAOperation, constVal : Double) : Int {
        add(SSAInstruction(operation, constVal))
        return size-1
    }

    fun addInstruction(operation : SSAOperation, constVal : Int) : Int {
        add(SSAInstruction(operation, constVal))
        return size-1
    }

    fun addInstruction(operation : SSAOperation, constVal : Boolean) : Int {
        add(SSAInstruction(operation, constVal))
        return size-1
    }

    override fun toString() : String {
        var s = ""
        var line = 0
        this.forEach({instruction ->
            s += "${line++} = $instruction\n"
        })
        return s
    }
}