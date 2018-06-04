package abstractinterpretation.computationalGraph

open class BinaryOpVertex<A,B,R> : Vertex<R> {
    val op : (A, B) -> R
    val a : Register<A>
    val b : Register<B>

    constructor(op : (A,B)->R, parent1 : Vertex<A>, parent2 : Vertex<B>) {
        this.op = op
        a = Register(parent1)
        b = Register(parent2)
    }

}