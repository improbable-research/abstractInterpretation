package abstractInterpretation.distributions

import abstractInterpretation.DoubleLike

interface ContinuousProbabilisticFunction {
    fun <T : DoubleLike<T>> apply(inputs : List<T>, rand: abstractInterpretation.randomFactory.DoubleLikeRandomFactory<T>): List<T>
}
