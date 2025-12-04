package generics.myFile2

interface Animal {
    fun feed()
}
interface GoodTempered {
    fun pet()
}

fun <T> pet(animal: T) where T : Animal, T : GoodTempered {
    animal.pet()
    animal.feed()
}

class Cookie : Animal, GoodTempered {
    override fun pet() {
        // ...
    }
    override fun feed() {
        // ...
    }
}
class Cujo : Animal {
    override fun feed() {
        // ...
    }
}

fun main() {
    pet(Cookie()) // OK
//    pet(Cujo()) //COMPILATION ERROR, Cujo is not GoodTempered
}
