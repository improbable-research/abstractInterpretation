package abstractInterpretation

interface DoubleLike<T : DoubleLike<T>> : ArithmeticOperators<T> {
    operator fun minus(value: Double): T {
        return this - new(value)
    }

    operator fun plus(value: Double): T {
        return this + new(value)
    }

    operator fun times(value: Double): T {
        return this * new(value)
    }

    operator fun div(value: Double): T {
        return this / new(value)
    }

    operator fun unaryMinus(): T
    fun log() : T
    fun pow(exponent: T) : T
    fun pow(exponent: Double) : T {
        return pow(new(exponent))
    }
    fun new(d : Double) : T
}