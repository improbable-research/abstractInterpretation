package abstractinterpretation.autodiff.trig

import abstractinterpretation.autoDiff.DifferentiableDouble
import kotlin.math.cos
import kotlin.math.sin

class Sin(val a: DifferentiableDouble) : DifferentiableDouble() {

    init {
        a.addChild(this)
    }

    override fun updateValue() {
        value = sin(a.value)
    }

    override fun fwdAutoDiff() {
        delta = cos(a.value) * a.delta
        propagateFwdAutoDiff()
    }

    override fun propagateRevAutoDiff() {
        val parentDx = cos(a.value) * delta
        a.revAutoDiff(this, parentDx)
    }
}
