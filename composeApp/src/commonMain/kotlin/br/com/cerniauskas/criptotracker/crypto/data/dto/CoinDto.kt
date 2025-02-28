package br.com.cerniauskas.criptotracker.crypto.data.dto

import kotlinx.serialization.Serializable

@Serializable
data class CoinDto (
    val id: String,
    val rank: Int,
    val name: String,
    val symbol: String,
    val marketCapUsd: String,
    val priceUsd: String,
    val changePercent24Hr: String
)