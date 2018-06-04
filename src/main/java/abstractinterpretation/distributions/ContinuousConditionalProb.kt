package abstractinterpretation.distributions

import abstractinterpretation.abstractTypes.DoubleLike

interface ContinuousConditionalProb {
    fun <T : DoubleLike<T>> logProb(randVars: abstractinterpretation.randomFactory.DoubleLikeRandomFactory<T>, givens: List<T>): T
}
