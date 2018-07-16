package abstractInterpretation.DAGInterpretation

open class BinaryOpVertex<A,B,R> : BaseVertex<R> {
    val op : (A, B) -> R
    val a : Vertex<A>
    val b : Vertex<B>

    constructor(op : (A,B)->R, parent1 : Vertex<A>, parent2 : Vertex<B>) {
        this.op = op
        a = parent1
        b = parent2
        parent1.addChild(a)
        parent2.addChild(b)
    }

}