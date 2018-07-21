package abstractInterpretation.SSAInterpretation

import abstractInterpretation.DoubleLike

class SSADouble(id : Int) : SSAVariable(id), DoubleLike<SSADouble> {

    companion object {
        fun new(value: Double): SSADouble {
            return(SSADouble(SSACode.addInstruction(SSAOperation.NEWDOUBLE, value)))
        }
    }

    override fun minus(that: SSADouble): SSADouble {
        return(SSADouble(SSACode.addInstruction(SSAOperation.MINUS, this, that)))
    }

    override fun plus(that: SSADouble): SSADouble {
        return(SSADouble(SSACode.addInstruction(SSAOperation.PLUS, this, that)))
    }

    override fun times(that: SSADouble): SSADouble {
        return(SSADouble(SSACode.addInstruction(SSAOperation.TIMES, this, that)))
    }

    override fun div(that: SSADouble): SSADouble {
        return(SSADouble(SSACode.addInstruction(SSAOperation.DIVIDE, this, that)))
    }

    override fun unaryMinus(): SSADouble {
        return(SSADouble(SSACode.addInstruction(SSAOperation.UNARYMINUS, this)))
    }

    override fun log(): SSADouble {
        return(SSADouble(SSACode.addInstruction(SSAOperation.LOG, this)))
    }

    override fun pow(exponent: SSADouble): SSADouble {
        return(SSADouble(SSACode.addInstruction(SSAOperation.POW, this)))
    }

    override fun new(d: Double): SSADouble {
        return Companion.new(d)
    }

    override infix fun eq(other : SSADouble) : SSADouble {
        id = other.id
        return this
    }

}