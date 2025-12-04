import kotlin.reflect.typeOf

class AA

/*
fun <T> example(a: Any) {
    val check = a is T // ERROR
    val ref = T::class // ERROR
    val type = typeOf<T>() // ERROR
}
*/


inline fun <reified T> example1(a: Any) {
    val check = a is T
    println("check = $check")
    val ref = T::class
    println("ref = $ref")
    val type = typeOf<T>()
    println("type = $type")

}

fun main(){
    println("--- String ---")
    example1<String>("ABC")
    println("--- Int ---")
    example1<Int>(5)
    println("--- class AA ---")
    example1<AA>( AA() )
}
/*
--- String ---
check = true
ref = class kotlin.String
type = kotlin.String
--- Int ---
check = true
ref = class kotlin.Int
type = kotlin.Int
--- class AA ---
check = true
ref = class AA
type = AA
 */