package abstractInterpretation.SSAInterpretation

enum class SSAOperation {
    PLUS,
    MINUS,
    TIMES,
    DIVIDE,
    UNARYMINUS,
    LOG,
    POW,
    GOTO,
    BRANCHIFNOT,
    JOIN,
    NEWINT,
    NEWDOUBLE,
    NEWBOOL;
}