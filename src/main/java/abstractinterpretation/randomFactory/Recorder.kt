package abstractinterpretation.randomFactory

import abstractinterpretation.abstractTypes.DoubleLike
import abstractinterpretation.abstractTypes.IntLike

class Recorder<D : DoubleLike<D>,I : IntLike<I>>(val factory : abstractinterpretation.randomFactory.RandomFactory<D, I>) : abstractinterpretation.randomFactory.RandomFactory<D,I> {

    val trace = abstractinterpretation.trace.Trace<D,I>()
    var isRecording = true

    fun record() {
        trace.clear()
        isRecording = true
    }

    fun replay() {
        trace.rewind()
        isRecording = false
    }

    override fun nextGaussian(mu : D, sigma : D): D {
        if(!isRecording) trace.nextDouble()
        val r = factory.nextGaussian(mu, sigma)
        trace.add(r)
        return r
    }

    override fun getLogProb(): D {
        return factory.logProb
    }

    override fun setLogProb(value: Double) {
        factory.setLogProb(value)
    }

    override fun nextConstant(value: Double): D {
        val r = factory.nextConstant(value)
        return r
    }

    override fun nextInt(): I {
        if(!isRecording) return trace.nextInt()
        val r = factory.nextInt();
        trace.add(r)
        return r
    }
}
