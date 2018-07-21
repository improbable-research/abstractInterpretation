import abstractInterpretation.AbstractInterpretation
import abstractInterpretation.BoolLike
import abstractInterpretation.DoubleLike
import abstractInterpretation.IntLike
import abstractInterpretation.SSAInterpretation.SSACode
import abstractInterpretation.SSAInterpretation.SSAInterpretation

fun main(args : Array<String>) {
    myFun(SSAInterpretation)
    println(SSACode.toString())
}

fun <INT : IntLike<INT>, DOUBLE : DoubleLike<DOUBLE>, BOOL : BoolLike<BOOL>>myFun(p : AbstractInterpretation<DOUBLE,INT,BOOL>) {
    val a = p.newDouble(123.4)
    val b = p.newDouble(234.5)
    val c = a + b
    var d = c * c
    val cond = p.newBool(true)
    p.If(cond) {
        d eq d + c
    } Else {
        d eq b + c
    }
    d eq d + b


}

