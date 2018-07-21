package abstractInterpretation.SSAInterpretation

import abstractInterpretation.BoolLike

class SSABool(id : Int) : SSAVariable(id), BoolLike<SSABool> {

    companion object {
        fun new(value: Boolean): SSABool {
            return(SSABool(SSACode.addInstruction(SSAOperation.NEWBOOL, value)))
        }
    }

}