package abstractInterpretation.DAGInterpretation

class IntBinaryOpVertex<A,B>(op: (A, B) -> Int, parent1: Vertex<A>, parent2: Vertex<B>) : BinaryOpVertex<A,B,Int>(op, parent1, parent2), IntVertex {
}