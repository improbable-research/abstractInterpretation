package abstractInterpretation


operator fun <T : IntLike<T>>Int.plus(that: IntLike<T>): T {
    return that.plus(this)
}

operator fun <T : IntLike<T>>Int.minus(that: IntLike<T>): T {
    return that.unaryMinus().plus(this)
}

operator fun <T: IntLike<T>>Int.times(that: IntLike<T>): T {
    return that * this
}

operator fun <T: IntLike<T>>IntLike<T>.inc(): T {
    return this.plus(1)
}

operator fun <T: IntLike<T>>IntLike<T>.dec(): T {
    return this.minus(1)
}
