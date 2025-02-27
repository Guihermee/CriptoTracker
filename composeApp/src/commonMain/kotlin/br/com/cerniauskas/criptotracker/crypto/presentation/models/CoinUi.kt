package br.com.cerniauskas.criptotracker.crypto.presentation.models

import br.com.cerniauskas.criptotracker.core.presentation.getDrawableIdForCoin
import br.com.cerniauskas.criptotracker.crypto.domain.Coin
import org.jetbrains.compose.resources.DrawableResource

data class CoinUi(
    val id: String,
    val rank: Int,
    val name: String,
    val symbol: String,
    val marketCapUsd: DisplayableNumber,
    val priceUsd: DisplayableNumber,
    val changePercent24Hr: DisplayableNumber,
    val iconRes: DrawableResource
)

data class DisplayableNumber(
    val value: Double,
    val formatted: String
)

fun Coin.toCoinUi(): CoinUi {
    return CoinUi(
        id = id,
        rank = rank,
        name = name,
        symbol = symbol,
        marketCapUsd = marketCapUsd.toDisplayableNumber(),
        priceUsd = priceUsd.toDisplayableNumber(),
        changePercent24Hr = changePercent24Hr.toDisplayableNumber(),
        iconRes = getDrawableIdForCoin(symbol)
    )
}

fun Double.toDisplayableNumber(): DisplayableNumber {
    return DisplayableNumber(
        value = this,
        formatted = formatAsCurrency(this.toString())
    )
}

//fun formatAsCurrency(value: Double): String {
//    val parts = value.toString().split(".")
//    val integerPart = parts[0].reversed().chunked(3).joinToString(",").reversed()
//    val decimalPart = if (parts.size > 1) parts[1].padEnd(2, '0') else "00"
//    return "$integerPart.$decimalPart"
//}

fun formatAsCurrency(value: String): String {
    val parts = value.split(".") // Divide parte inteira e decimal
    val integerPart = parts[0].reversed().chunked(3).joinToString(",").reversed() // Formata os milhares
    val decimalPart = if (parts.size > 1) parts[1].take(2) else "00" // Pega só os dois primeiros números depois do ponto

    return "$integerPart.$decimalPart"
}