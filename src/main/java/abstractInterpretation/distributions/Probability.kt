package abstractInterpretation.distributions

interface Probability<R, T> {
    fun logProb(randVars: R): T
}
