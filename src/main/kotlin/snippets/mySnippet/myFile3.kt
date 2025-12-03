/*
В этом примере результат сложения 1.2345 и 2.3456 будет
округлён до двух значащих цифр
(а не до двух знаков после запятой), что даёт 3.6
 */
package mySnippet.myFile3

import java.math.BigDecimal
import java.math.MathContext
import java.math.RoundingMode

fun main() {
    val MATH = MathContext(2)
    val num1 = BigDecimal("1.2345")
    val num2 = BigDecimal("2.3456")

    val result = num1.add(num2, MATH) // Сложение с использованием MathContext
    println(result) // Вывод: 3.6
}
/*
3.6
 */
