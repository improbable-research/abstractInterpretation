package abstractInterpretation.DAGInterpretation

import abstractInterpretation.DoubleLike

interface DoubleVertex : Vertex<Double>, DoubleLike<DoubleVertex> {

    override fun minus(that: DoubleVertex): DoubleVertex {
        return DoubleBinaryOpVertex(Double::minus, this, that)
    }

    override fun plus(that: DoubleVertex): DoubleVertex {
        return DoubleBinaryOpVertex(Double::plus, this, that)
    }

    override fun times(that: DoubleVertex): DoubleVertex {
        return DoubleBinaryOpVertex(Double::times, this, that)
    }

    override fun div(that: DoubleVertex): DoubleVertex {
        return DoubleBinaryOpVertex(Double::div, this, that)
    }

    override fun unaryMinus(): DoubleVertex {
        return DoubleUnaryOpVertex(Double::unaryMinus, this)
    }

    override fun log(): DoubleVertex {
        return DoubleUnaryOpVertex(Double::unaryMinus, this)
    }

    override fun pow(exponent: DoubleVertex): DoubleVertex {
        return DoubleBinaryOpVertex(Math::pow, this, exponent)
    }

    override fun new(d : Double) : DoubleVertex {
        return NewDoubleVertex(d)
    }
}