package abstractInterpretation.DAGInterpretation

interface Vertex<T> {
    fun addChild(child : Vertex<T>)
}
