import abstractInterpretation.DoubleLike
import abstractInterpretation.IntLike
import abstractInterpretation.AbstractInterpretation

class Model<DOUBLE : DoubleLike<DOUBLE>, INT : IntLike<INT>>(val interpretation : AbstractInterpretation<DOUBLE, INT, *>) {
    fun oneplusone() : DOUBLE {
        val a = interpretation.newDouble(1.0)
        val b = interpretation.newDouble(1.0)
        val c = a+b
        return c
    }
}