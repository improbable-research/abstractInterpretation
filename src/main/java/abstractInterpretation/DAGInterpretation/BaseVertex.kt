package abstractInterpretation.DAGInterpretation

open class BaseVertex<T> : Vertex<T> {
    val children = ArrayList<Vertex<T>>()

    override fun addChild(child: Vertex<T>) {
        children.add(child)
    }

}