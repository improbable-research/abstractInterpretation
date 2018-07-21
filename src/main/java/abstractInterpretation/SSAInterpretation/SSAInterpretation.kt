package abstractInterpretation.SSAInterpretation

import abstractInterpretation.AbstractInterpretation

object SSAInterpretation: AbstractInterpretation<SSADouble, SSAInt, SSABool> {
    override fun newDouble(x: Double): SSADouble {
        return SSADouble.new(x)
    }

    override fun newInt(i: Int): SSAInt {
        return SSAInt.new(i)
    }

    override fun newBool(b: Boolean): SSABool {
        return SSABool.new(b)
    }

    override fun If(cond : SSABool, ifLambda : ()->Unit) : IfClass {
        return IfClass(cond, ifLambda)
    }

}