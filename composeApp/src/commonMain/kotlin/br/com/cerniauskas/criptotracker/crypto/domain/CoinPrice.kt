package br.com.cerniauskas.criptotracker.crypto.domain

import kotlinx.datetime.LocalDateTime

data class CoinPrice(
    val dateTime: LocalDateTime,
    val priceUsd: Double
)
