package abstractInterpretation

interface IntLike<T : IntLike<T>> : ArithmeticOperators<T> {
    operator fun minus(value: Int): T {
        return this - new(value)
    }

    operator fun plus(value: Int): T {
        return this + new(value)
    }

    operator fun times(value: Int): T {
        return this * new(value)
    }

    operator fun div(value: Int): T {
        return this / new(value)
    }

    operator fun inc() : T {
        return this + 1
    }

    operator fun dec() : T {
        return this - 1
    }

    operator fun unaryMinus() : T

    fun new(value : Int) : T

}