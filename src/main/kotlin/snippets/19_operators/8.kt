package f_19_operators.s_8

import java.math.BigDecimal
import java.time.LocalDateTime

fun main() {
    val amount = BigDecimal("42.80")
    val minPrice = BigDecimal("5.00")
    val maxPrice = BigDecimal("100.00")
    val correctPrice = amount in minPrice..maxPrice
    println(correctPrice) // true

    val now = LocalDateTime.now()
    val actionStarts = LocalDateTime.of(1410, 7, 15, 0, 0)
    val actionEnds = actionStarts.plusDays(1)
    println(now in actionStarts..actionEnds) // false

    val dtBegin = LocalDateTime.of(2025, 12, 4, 12, 16)
    val dtEnd = LocalDateTime.of(2025, 12, 4, 12, 30)
    val now1 = LocalDateTime.now()
    println(now1 in dtBegin..dtEnd) // true (если now1 соответствовал, например, 04.12.25 12:19)
}
/*
true
false
true
 */