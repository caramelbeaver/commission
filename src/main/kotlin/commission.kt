const val MAX_FREE = 75000.00
const val DEFAULT_COMMISSION_MC = 20.00
const val MIN_COMMISSION_VISA_MIR = 35.00

const val MASTER_CARD = "Master Card"
const val MAESTRO = "Maestro"
const val VISA = "VISA"
const val MIR = "MIR"
const val VK_PAY = "VK PAY"

fun main() {
    val amount = 40000
    val sumCommission = payment(40000)
    println("Размер комиссии: $sumCommission руб")

}

fun payment(
    amount: Int,
    sumAmount: Int = 0,
    card: String = VK_PAY
) = when (card) {
    MASTER_CARD, MAESTRO -> if (sumAmount <= MAX_FREE) 0 else (amount * 0.6) / 100 + DEFAULT_COMMISSION_MC

    VISA, MIR -> {
        val a = (amount * 0.75) / 100
        if (a > MIN_COMMISSION_VISA_MIR) a else MIN_COMMISSION_VISA_MIR
    }
    VK_PAY -> 0
    else -> error("Данная карта не поддерживается")
}