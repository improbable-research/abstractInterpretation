package abstractInterpretation.DAGInterpretation

import abstractInterpretation.AbstractInterpretation
import abstractInterpretation.ElseConsumer
import abstractInterpretation.concreteInterpretation.ABool

object DAGInterpretation: AbstractInterpretation<DoubleVertex, IntVertex, ABool> {
    override fun newDouble(x: Double): DoubleVertex {
        return NewDoubleVertex(x)
    }

    override fun newInt(i: Int): IntVertex {
        return NewIntVertex(i)
    }

    override fun newBool(b: Boolean): ABool {
        return ABool(b)
    }

}