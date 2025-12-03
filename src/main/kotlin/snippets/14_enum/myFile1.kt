package f_14_enum.myFile1

enum class PaymentOption {
    CASH,
    CARD,
    TRANSFER,
}
fun main() {
    val option: PaymentOption =
        PaymentOption.valueOf("TRANSFER")
    println(option)
    println("All options: ")
    val paymentOptions: Array<PaymentOption> =
        PaymentOption.values()
    for (paymentOption in paymentOptions) {
        println(paymentOption)
    }
}
// TRANSFER
// All options:
// CASH
// CARD
// TRANSFER