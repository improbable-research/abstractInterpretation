package abstractInterpretation.SSAInterpretation

class SSAInstruction {
    val operation : SSAOperation
    var operand1 : Int
    var operand2 : Int

    constructor(operation :SSAOperation, operand1 : SSAVariable, operand2 : SSAVariable) {
        this.operation = operation
        this.operand1 = operand1.id
        this.operand2 = operand2.id
    }

    constructor(operation : SSAOperation, constValue : Double) {
        val doubleBits = constValue.toRawBits()
        this.operation = operation
        this.operand1 = (doubleBits ushr 32).toInt()
        this.operand2 = (doubleBits and 0xffffffff).toInt()
    }

    constructor(operation : SSAOperation, constValue : Int) {
        this.operation = operation
        this.operand1 = 0
        this.operand2 = constValue
    }

    constructor(operation : SSAOperation, constValue : Boolean) {
        this.operation = operation
        this.operand1 = 0
        this.operand2 = if(constValue) 1 else 0
    }


    override fun toString() : String {
        return "$operand1 $operation $operand2"
//        return "\uD80C\uDC00 ${(55308).toChar()}${(operand1+56320).toChar()} $operation ${(55308).toChar()}${(operand2+56320).toChar()}"
    }
}
