package abstractInterpretation.SSAInterpretation

import abstractInterpretation.IntLike

class SSAInt(id : Int) : SSAVariable(id), IntLike<SSAInt> {

    companion object {
        fun new(value: Int): SSAInt {
            return(SSAInt(SSACode.addInstruction(SSAOperation.NEWINT, value)))
        }
    }

    override fun minus(that: SSAInt): SSAInt {
        return(SSAInt(SSACode.addInstruction(SSAOperation.MINUS, this, that)))
    }

    override fun plus(that: SSAInt): SSAInt {
        return(SSAInt(SSACode.addInstruction(SSAOperation.PLUS, this, that)))
    }

    override fun times(that: SSAInt): SSAInt {
        return(SSAInt(SSACode.addInstruction(SSAOperation.TIMES, this, that)))
    }

    override fun div(that: SSAInt): SSAInt {
        return(SSAInt(SSACode.addInstruction(SSAOperation.DIVIDE, this, that)))
    }

    override fun unaryMinus(): SSAInt {
        return(SSAInt(SSACode.addInstruction(SSAOperation.UNARYMINUS, this)))
    }

    override fun new(value: Int): SSAInt {
        return SSAInt.new(value)
    }
}