package f_13_exceptions.myFile1

private fun calculate(): Int {
    return 1 / 0
}

private fun printCalculated() {
    println(calculate())
}

fun main() {
    println("Before")
    printCalculated()
    println("After") //напечатано не будет
}
/*
Before
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at f_13_exceptions.myFile1.MyFile1Kt.calculate(myFile1.kt:4)
	at f_13_exceptions.myFile1.MyFile1Kt.printCalculated(myFile1.kt:8)
	at f_13_exceptions.myFile1.MyFile1Kt.main(myFile1.kt:13)
	at f_13_exceptions.myFile1.MyFile1Kt.main(myFile1.kt)
 */
