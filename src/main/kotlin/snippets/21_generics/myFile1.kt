fun <T : Comparable<T>> maxOf(a: T, b: T): T {
    return if (a >= b) a else b
}

fun main() {

    class A
//    maxOf(A(), A()) // Compilation error(если раскомментировать),
    // A is not Comparable<A>

    data class B( val id: Int ): Comparable<B>{
        override fun compareTo(other: B) = id.compareTo(other.id)
    }
    println( maxOf(B(1), B(2)))
}
/*
B(id=2)
 */