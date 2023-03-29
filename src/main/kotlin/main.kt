fun main() {
    val result = calculatePrice(11500, "regularUser")
    println(result)
}

fun calculatePrice(totalPrice: Int, level: String): Int {
    val total = if (totalPrice < 1_000) {
        (1 - userLevel(level)) * totalPrice
    } else if (totalPrice in 1_001..9999) {
        (totalPrice - 100) * (1 - userLevel(level))
    } else (totalPrice / 1.05) * (1 - userLevel(level))
    return  total.toInt()
}

fun userLevel(level: String) = when (level) {
    "regularUser" -> 0.01
    else -> 0.0
}