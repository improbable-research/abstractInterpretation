package abstractinterpretation.distributions

import abstractinterpretation.autoDiff.DifferentiableDouble

interface PDF : Probability<Map<DifferentiableDouble, Double>, DifferentiableDouble> {
    fun getVars() : List<DifferentiableDouble>
}
