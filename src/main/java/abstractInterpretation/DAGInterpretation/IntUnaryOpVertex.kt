package abstractInterpretation.DAGInterpretation

class IntUnaryOpVertex<A>(op: (A) -> Int, parent: Vertex<A>) : UnaryOpVertex<A, Int>(op, parent), IntVertex {
}