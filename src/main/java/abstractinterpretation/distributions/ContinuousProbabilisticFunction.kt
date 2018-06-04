package abstractinterpretation.distributions

import abstractinterpretation.abstractTypes.DoubleLike

interface ContinuousProbabilisticFunction {
    fun <T : DoubleLike<T>> apply(inputs : List<T>, rand: abstractinterpretation.randomFactory.DoubleLikeRandomFactory<T>): List<T>
}
