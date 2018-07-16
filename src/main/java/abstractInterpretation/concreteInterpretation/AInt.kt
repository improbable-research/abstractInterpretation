package abstractInterpretation.concreteInterpretation

import abstractInterpretation.IntLike

class AInt(val value: Int) : IntLike<AInt> {

    override fun minus(that: AInt): AInt {
        return AInt(value - that.value)
    }

    override fun plus(that: AInt): AInt {
        return AInt(value + that.value)
    }

    override fun times(that: AInt): AInt {
        return AInt(value * that.value)
    }

    override fun div(that: AInt): AInt {
        return AInt(value / that.value)
    }

    override fun minus(value: Int): AInt {
        return AInt(this.value - value)
    }

    override fun plus(value: Int): AInt {
        return AInt(this.value + value)
    }

    override fun times(value: Int): AInt {
        return AInt(this.value * value)
    }

    override fun div(value: Int): AInt {
        return AInt(this.value / value)
    }

    override fun unaryMinus(): AInt {
        return AInt(-value)
    }

    override fun new(value : Int) : AInt {
        return AInt(value)
    }

}
