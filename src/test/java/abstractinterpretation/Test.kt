package abstractinterpretation

import abstractinterpretation.abstractTypes.DoubleLike
import abstractinterpretation.distributions.ContinuousProbabilisticFunction
import abstractinterpretation.distributions.ProbabilisticProgram
import abstractinterpretation.inference.findMAP

class Test : ContinuousProbabilisticFunction {

    @org.junit.Test
    fun test() {
        val rand = abstractinterpretation.randomFactory.DifferentiableRandom()
        val probProgram = ProbabilisticProgram(this, listOf())
        val (t1, t2, temp) = probProgram.outputs
        val observedProg = probProgram.observe(mapOf(
                t1 to 21.0,
                t2 to 22.0 ))
        observedProg.findMAP(200)
        println(temp.value)
    }


    override fun <T : DoubleLike<T>> apply(doubleParams: List<T>, rand: abstractinterpretation.randomFactory.DoubleLikeRandomFactory<T>): List<T> {
        val temp = rand.nextGaussian(20.0,2.0)
        val t1 = rand.nextGaussian(temp, 1.0)
        val t2 = rand.nextGaussian(temp, 1.0)

        return listOf(t1, t2, temp)
    }
}
