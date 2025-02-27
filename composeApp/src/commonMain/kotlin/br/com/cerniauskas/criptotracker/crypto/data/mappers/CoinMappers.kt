package br.com.cerniauskas.criptotracker.crypto.data.mappers

import br.com.cerniauskas.criptotracker.crypto.data.dto.CoinDto
import br.com.cerniauskas.criptotracker.crypto.domain.Coin

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