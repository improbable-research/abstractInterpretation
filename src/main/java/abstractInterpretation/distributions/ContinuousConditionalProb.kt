package abstractInterpretation.distributions

import abstractInterpretation.DoubleLike

interface ContinuousConditionalProb {
    fun <T : DoubleLike<T>> logProb(randVars: abstractInterpretation.randomFactory.DoubleLikeRandomFactory<T>, givens: List<T>): T
}
