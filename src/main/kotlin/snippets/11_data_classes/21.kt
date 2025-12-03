package f_11_data_classes.s_21

data class FullName(
    val firstName: String,
    val lastName: String
)

fun String.parseName(): FullName? {
    val indexOfLastSpace = this.trim().lastIndexOf(' ')
    if (indexOfLastSpace < 0) return null
    val firstName = this.take(indexOfLastSpace)
    val lastName = this.drop(indexOfLastSpace).trim()
    return FullName(firstName, lastName)
}

fun main() {
    val fullName = "Алексей Смирнов"
    val (firstName, lastName) = fullName.parseName() ?: return
    print("His name is $firstName $lastName")
    /*
     His name is Алексей Смирнов
     */
}
