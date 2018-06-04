package abstractinterpretation.computationalGraph

import java.util.function.Consumer
import java.util.function.Supplier

class Register<T>(val parent : Vertex<T>) : Consumer<T>, Supplier<T?> {
    var x : T? = null


    override fun accept(p0: T) {
        x = p0
    }

    override fun get() : T? {
        return x
    }
}
