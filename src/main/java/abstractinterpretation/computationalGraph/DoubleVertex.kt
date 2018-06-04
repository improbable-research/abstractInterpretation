package abstractinterpretation.computationalGraph

import abstractinterpretation.abstractTypes.ADouble
import abstractinterpretation.abstractTypes.DoubleLike

class DoubleVertex<T : DoubleLike<T>> : Vertex<T>(), DoubleLike<DoubleVertex<T>> {

    override fun minus(that: DoubleVertex<T>): DoubleVertex<T> {
        val newVertex = DoubleVertex<T>()
        return newVertex

    }

    override fun minus(value: Double): DoubleVertex<T> {
        val newVertex = DoubleVertex<T>()
        return newVertex
    }

    override fun plus(value: Double): DoubleVertex<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun times(value: Double): DoubleVertex<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun div(value: Double): DoubleVertex<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun unaryMinus(): DoubleVertex<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun log(): DoubleVertex<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun pow(exponent: DoubleVertex<T>): DoubleVertex<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun pow(exponent: Double): DoubleVertex<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun plus(that: DoubleVertex<T>): DoubleVertex<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun times(that: DoubleVertex<T>): DoubleVertex<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun div(that: DoubleVertex<T>): DoubleVertex<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}