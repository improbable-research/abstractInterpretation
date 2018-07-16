package abstractInterpretation.DAGInterpretation

class DoubleUnaryOpVertex<A>(op: (A) -> Double, parent: Vertex<A>) : UnaryOpVertex<A, Double>(op, parent), DoubleVertex {
}