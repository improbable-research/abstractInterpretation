package abstractinterpretation.computationalGraph

import abstractinterpretation.abstractTypes.DoubleLike

class DoubleBinaryVertex<T : DoubleLike<T>>(op: (T, T) -> T, parent1: Vertex<T>, parent2: Vertex<T>) : BinaryOpVertex<T, T, T>(op, parent1, parent2), DoubleLike<Vertex<T>> {
}