package abstractInterpretation;

public interface AbstractInterpretation<
    DOUBLETYPE extends DoubleLike<DOUBLETYPE>,
    INTTYPE extends IntLike<INTTYPE>,
    BOOLTYPE extends BoolLike<BOOLTYPE>
    > {
    DOUBLETYPE  newDouble(double x);
    INTTYPE     newInt(int i);
    BOOLTYPE    newBool(boolean b);

}

