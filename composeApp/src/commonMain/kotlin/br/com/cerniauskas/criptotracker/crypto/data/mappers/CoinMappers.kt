package br.com.cerniauskas.criptotracker.crypto.data.mappers

import br.com.cerniauskas.criptotracker.crypto.data.dto.CoinDto
import br.com.cerniauskas.criptotracker.crypto.data.dto.CoinPriceDto
import br.com.cerniauskas.criptotracker.crypto.domain.Coin
import br.com.cerniauskas.criptotracker.crypto.domain.CoinPrice
import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDateTime

fun CoinDto.toCoin(): Coin {
    println("COIN DTO: $this")

    val coin = Coin(
        id = id,
        rank = rank,
        name = name,
        symbol = symbol,
        marketCapUsd = marketCapUsd,
        priceUsd = priceUsd,
        changePercent24Hr = changePercent24Hr
    )
    println("COIN: $this")
    return coin
}

fun CoinPriceDto.toCoinPrice(): CoinPrice {
    return CoinPrice(
        priceUsd = priceUsd,
        dateTime = LocalDateTime(time) // todo this
    )
}