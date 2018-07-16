package abstractInterpretation

interface BoolExtensions<T,BOOL> {
    infix fun T.greaterThan(other : T) : BOOL
    // ...
}
