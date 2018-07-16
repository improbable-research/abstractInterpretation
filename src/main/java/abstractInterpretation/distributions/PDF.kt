package abstractInterpretation.distributions

import abstractInterpretation.autoDiff.DifferentiableDouble

interface PDF : Probability<Map<DifferentiableDouble, Double>, DifferentiableDouble> {
    fun getVars() : List<DifferentiableDouble>
}
