package abstractInterpretation.SSAInterpretation

object Snapshot {
    var isCacheing = false
    val modifiedVars : MutableSet<SSAVariable> = mutableSetOf()

    fun takeSnapshot() {
        isCacheing = true
    }

    fun setCacheingOff() {
        isCacheing = false
    }

    fun markAsModified(v : SSAVariable) {
        modifiedVars.add(v)
    }

    fun revertToSnapshot() {
        isCacheing = false
        modifiedVars.forEach({it.revert()})
        modifiedVars.clear()
    }

}