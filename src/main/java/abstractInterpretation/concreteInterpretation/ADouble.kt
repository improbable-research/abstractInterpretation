package abstractInterpretation.concreteInterpretation

import abstractInterpretation.DoubleLike

class ADouble(val value: Double) : DoubleLike<ADouble> {
    override fun new(d: Double): ADouble {
        return ADouble(d)
    }

    override inline fun pow(exponent: ADouble): ADouble {
        return ADouble(Math.pow(this.value, exponent.value))
    }

    override inline fun pow(exponent: Double): ADouble {
        return ADouble(Math.pow(this.value, exponent))
    }

    override inline fun log(): ADouble {
        return ADouble(Math.log(value))
    }

    override inline fun minus(that: ADouble): ADouble {
        return ADouble(value - that.value)
    }

    override inline fun plus(that: ADouble): ADouble {
        return ADouble(value + that.value)
    }

    override fun times(that: ADouble): ADouble {
        return ADouble(value * that.value)
    }

    override fun div(that: ADouble): ADouble {
        return ADouble(value / that.value)
    }

    override fun minus(value: Double): ADouble {
        return ADouble(this.value - value)
    }

    override fun plus(value: Double): ADouble {
        return ADouble(this.value + value)
    }

    override fun times(value: Double): ADouble {
        return ADouble(this.value * value)
    }

    override fun div(value: Double): ADouble {
        return ADouble(this.value / value)
    }

    override fun unaryMinus(): ADouble {
        return this * -1.0
    }

    override fun toString() : String {
        return value.toString()
    }
}
