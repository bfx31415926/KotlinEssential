package generics.MyFile3

fun main() {
    val list = listOf("A", "B")
    println(list is List<*>) // true
//    println(list is List<Int>) // Compilation error (из-за "Type erasure" )
}
/*
true
 */