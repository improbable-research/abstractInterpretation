package abstractInterpretation.SSAInterpretation

open class SSAVariable {

    constructor(id : Int) {
        cachedId = 0
        this.id = id
        cachedId = null
    }

    var id : Int
        set(value) {
            if(Snapshot.isCacheing && cachedId == null) {
                cachedId = id
                Snapshot.markAsModified(this)
            }
            field = value
        }

    var cachedId : Int?

    fun revert() : Int {
        val origVal = id
        val oldVal = cachedId // need this as id has a setter that depends on cachedId
        if(oldVal != null) id = oldVal
        cachedId = null
        return origVal
    }

    override fun toString() : String {
        return id.toString()
    }

    infix fun eq(other : SSAVariable) : SSAVariable {
        id = other.id
        return this
    }

}