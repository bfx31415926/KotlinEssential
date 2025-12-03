package f_13_exceptions.s_6

fun someFunction() {
    throw Throwable("Some error")
}

fun main() {
    try {
        someFunction()
    } finally {
        println("Finally block was called")
    }
    println("Will not be printed") //Will not be printed
}
/*
Finally block was called
Exception in thread "main" java.lang.Throwable: Some error
	at f_13_exceptions.s_6._6Kt.someFunction(6.kt:4)
	at f_13_exceptions.s_6._6Kt.main(6.kt:9)
	at f_13_exceptions.s_6._6Kt.main(6.kt)

Process finished with exit code 1
 */