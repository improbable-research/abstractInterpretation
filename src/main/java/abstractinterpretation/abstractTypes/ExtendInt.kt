package io.improbable.keanu.kotlin

import abstractinterpretation.abstractTypes.IntLike


operator fun <T : IntLike<T>>Int.plus(that: IntLike<T>): T {
    return that.plus(this)
}

operator fun <T : IntLike<T>>Int.minus(that: IntLike<T>): T {
    return that.unaryMinus().plus(this)
}

operator fun <T: IntLike<T>>Int.times(that: IntLike<T>): T {
    return that * this
}

