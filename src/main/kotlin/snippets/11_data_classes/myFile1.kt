package myFile1

class Player(
    val id: Int,
    val name: String,
    val points: Int
){
    operator fun component1() = id
    operator fun component2() = name
    operator fun component3() = points
}

fun main() {
    val player = Player(0, "Gecko", 9999)
    val (id, name, pts) = player
    println(id) // 0
    println(name) // Gecko
    println(pts) // 9999
}
