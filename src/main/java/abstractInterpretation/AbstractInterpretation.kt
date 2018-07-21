package abstractInterpretation

interface AbstractInterpretation<DOUBLETYPE : DoubleLike<DOUBLETYPE>, INTTYPE : IntLike<INTTYPE>, BOOLTYPE : BoolLike<BOOLTYPE>> {
    fun newDouble(x: Double): DOUBLETYPE
    fun newInt(i: Int): INTTYPE
    fun newBool(b: Boolean): BOOLTYPE
    fun If(condition : BOOLTYPE, ifLambda : ()->Unit) : ElseConsumer {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

