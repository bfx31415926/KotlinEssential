package f_16_annotations.s_1

import java.math.BigDecimal
import java.math.MathContext

class Money(
    val amount: BigDecimal,
    val currency: String,
) {
    @Throws(IllegalArgumentException::class)
    operator fun plus(other: Money): Money {
        require(currency == other.currency)
        return Money(amount + other.amount, currency)
    }

    companion object {
        @JvmField
        val MATH = MathContext(2)

        @JvmStatic
        fun eur(amount: Double) =
            Money(amount.toBigDecimal(MATH), "EUR")

        @JvmStatic
        fun usd(amount: Double) =
            Money(amount.toBigDecimal(MATH), "USD")

        @JvmStatic
        fun pln(amount: Double) =
            Money(amount.toBigDecimal(MATH), "PLN")
    }
}

fun main(){
    val money1 = Money( BigDecimal(1 ), "USD")
    val money2 = Money( BigDecimal(2 ), "USD")
    val moneyBad = Money( BigDecimal(2 ), "USD1")
    println(( money1 + money2).amount )
    println(( money1 + moneyBad).amount )
}
/*
3
... java.lang.IllegalArgumentException: Failed requirement.
*/