package abstractInterpretation.DAGInterpretation

class DoubleBinaryOpVertex<A,B>(op: (A, B) -> Double, parent1: Vertex<A>, parent2: Vertex<B>) : BinaryOpVertex<A, B, Double>(op, parent1, parent2), DoubleVertex {
}