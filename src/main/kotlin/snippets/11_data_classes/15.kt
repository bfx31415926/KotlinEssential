package f_11_data_classes.s_15

data class User(
    val name: String,
    val surname: String,
)

fun main() {
    val users = listOf(
        User("Nicola", "Corti")
    )
    users.forEach { u -> println(u) }
    // User(name=Nicola, surname=Corti)
    users.forEach { (u) -> println(u) }// здесь используется неочевидное деструктурирование
    // Nicola
    val (name) = users[0]
    println(name)
}
/*
User(name=Nicola, surname=Corti)
Nicola
Nicola
 */