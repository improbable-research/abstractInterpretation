package abstractinterpretation.distributions

import abstractinterpretation.autoDiff.DifferentiableDouble
import abstractinterpretation.randomFactory.DifferentiableRandom
import abstractinterpretation.randomFactory.Recorder


class ProbabilisticProgram : PDF {

    val model : ContinuousProbabilisticFunction
    val inputs : List<DifferentiableDouble>
    val outputs : List<DifferentiableDouble>
    val trace : abstractinterpretation.trace.Trace<DifferentiableDouble, abstractinterpretation.abstractTypes.AInt>
    val logP : DifferentiableDouble

    constructor(model : ContinuousProbabilisticFunction, inputs : List<DifferentiableDouble>) {
        this.model = model
        this.inputs = inputs
        val rand = Recorder(DifferentiableRandom())
        this.outputs = model.apply(inputs, rand)
        trace = rand.trace
        logP = rand.logProb
    }

    fun observe(observations : Map<DifferentiableDouble, Double>) : ConditionalPDF {
        return ConditionalPDF(this, observations)
    }

    override fun logProb(randVars: Map<DifferentiableDouble, Double>): DifferentiableDouble {
        var valchange = false
        randVars.forEach { (vertex, value) ->
            if(vertex.value != value) {
                valchange = true
                vertex.value = value
            }
        }
        if(valchange) logP.updateValue()
        return logP
    }

    override fun getVars(): List<DifferentiableDouble> {
        return inputs + trace.doubles
    }

}
