package br.com.cerniauskas.criptotracker.crypto.data.mappers

import br.com.cerniauskas.criptotracker.crypto.data.dto.CoinDto
import br.com.cerniauskas.criptotracker.crypto.data.dto.CoinPriceDto
import br.com.cerniauskas.criptotracker.crypto.domain.Coin
import br.com.cerniauskas.criptotracker.crypto.domain.CoinPrice
import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        rank = rank,
        name = name,
        symbol = symbol,
        marketCapUsd = marketCapUsd,
        priceUsd = priceUsd,
        changePercent24Hr = changePercent24Hr
    )
}

fun CoinPriceDto.toCoinPrice(): CoinPrice {
    return CoinPrice(
        priceUsd = priceUsd,
        dateTime = Instant
            .fromEpochMilliseconds(time)
            .toLocalDateTime(TimeZone.UTC)
    )
}