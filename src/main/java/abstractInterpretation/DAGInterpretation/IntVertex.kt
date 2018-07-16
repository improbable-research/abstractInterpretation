package abstractInterpretation.DAGInterpretation

import abstractInterpretation.IntLike

interface IntVertex : IntLike<IntVertex>, Vertex<Int> {
    override fun minus(that: IntVertex): IntVertex {
        return IntBinaryOpVertex(Int::minus,this, that)
    }

    override fun plus(that: IntVertex): IntVertex {
        return IntBinaryOpVertex(Int::plus,this, that)
    }

    override fun times(that: IntVertex): IntVertex {
        return IntBinaryOpVertex(Int::times,this, that)
    }

    override fun div(that: IntVertex): IntVertex {
        return IntBinaryOpVertex(Int::div,this, that)
    }

    override fun unaryMinus(): IntVertex {
        return IntUnaryOpVertex(Int::unaryMinus,this)
    }

    override fun new(i : Int) : IntVertex {
        return NewIntVertex(i)
    }
}