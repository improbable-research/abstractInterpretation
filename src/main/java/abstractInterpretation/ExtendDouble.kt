package abstractInterpretation


operator fun <T : DoubleLike<T>>Double.plus(that: DoubleLike<T>): T {
    return that.plus(this)
}

operator fun <T : DoubleLike<T>>Double.minus(that: DoubleLike<T>): T {
    return that.unaryMinus().plus(this)
}

operator fun <T: DoubleLike<T>>Double.times(that: DoubleLike<T>): T {
    return that * this
}

//operator fun Double.div(that: DoubleVertex): DoubleVertex {
//    return ConstantDoubleVertex(this) / that
//}
