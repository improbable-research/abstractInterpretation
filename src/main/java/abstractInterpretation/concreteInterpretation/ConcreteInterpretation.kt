package abstractInterpretation.concreteInterpretation

import abstractInterpretation.AbstractInterpretation

object ConcreteInterpretation : AbstractInterpretation<ADouble, AInt, ABool> {
    override fun newInt(i: Int): AInt {
        return AInt(i)
    }

    override fun newBool(b: Boolean): ABool {
        return ABool(b)
    }

    override fun newDouble(x: Double): ADouble {
        return ADouble(x)
    }
}