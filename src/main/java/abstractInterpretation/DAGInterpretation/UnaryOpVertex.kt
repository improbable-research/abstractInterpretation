package abstractInterpretation.DAGInterpretation

open class UnaryOpVertex<A,B> : BaseVertex<B> {
    val op : (A)-> B
    val a : Vertex<A>

    constructor(op : (A)->B, parent : Vertex<A>) {
        this.op = op
        a = parent
        parent.addChild(a)
    }
}
