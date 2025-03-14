package br.com.cerniauskas.criptotracker.crypto.data.dto

import kotlinx.serialization.Serializable

@Serializable
data class CoinsResponseDto (
    val data: List<CoinDto>
)