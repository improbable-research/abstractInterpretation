package abstractInterpretation


interface ArithmeticOperators<T> {
    operator fun minus(that: T): T
    operator fun plus(that: T): T
    operator fun times(that: T): T
    operator fun div(that: T): T
    infix fun eq(that: T) : T {
        return that
    }
}
