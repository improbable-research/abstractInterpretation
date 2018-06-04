package abstractinterpretation.autodiff.math

import abstractinterpretation.autoDiff.DifferentiableDouble
import java.lang.Math.log

class Log(val x: DifferentiableDouble) : DifferentiableDouble() {

    init {
        x.addChild(this)
    }

    override fun updateValue() {
        value = log(x.value)
    }

    override fun fwdAutoDiff() {
        delta = x.delta / x.value
        propagateFwdAutoDiff()
    }

    override fun propagateRevAutoDiff() {
        x.revAutoDiff(this, delta / x.value)
    }
}
