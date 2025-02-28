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
    println("COIN: $this")

    val coinUI = CoinUi(
        id = id,
        rank = rank,
        name = name,
        symbol = symbol,
        marketCapUsd = marketCapUsd.toDisplayableNumber(),
        priceUsd = priceUsd.toDisplayableNumber(),
        changePercent24Hr = changePercent24Hr.toDisplayableNumber(),
        iconRes = getDrawableIdForCoin(symbol)
    )

    println("COIN UI: $coinUI")
    return coinUI
}

fun String.toDisplayableNumber(): DisplayableNumber {
    return DisplayableNumber(
        value = formatValue(this),
        formatted = formatAsCurrency(this)
    )
}

fun Double.toDisplayableNumber(): DisplayableNumber {
    return DisplayableNumber(
        value = this, // Gera valores incorretos.
        formatted = formatAsCurrency(this.toString())
    )
}

fun formatAsCurrency(value: String): String {
    val parts = value.split(".") // Divide parte inteira e decimal
    val integerPart = parts[0].reversed().chunked(3).joinToString(",").reversed() // Formata os milhares
    val decimalPart = if (parts.size > 1) parts[1].take(2) else "00" // Pega só os dois primeiros números depois do ponto

    return "$integerPart.$decimalPart"
}

fun formatValue(value: String): Double {
    val parts = value.split(".") // Divide parte inteira e decimal
    val decimalPart = if (parts.size > 1) parts[1].take(2) else "00" // Pega só os dois primeiros números depois do ponto

    return "${parts[0]}.$decimalPart".toDouble()
}