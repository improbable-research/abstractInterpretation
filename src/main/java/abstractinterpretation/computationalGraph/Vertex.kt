package abstractinterpretation.computationalGraph


open class Vertex<T> {
    val children = ArrayList<Register<T>>()

    fun addChild(child : Register<T>) {
        children.add(child)
    }
}
