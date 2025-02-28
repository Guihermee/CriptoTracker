package br.com.cerniauskas.criptotracker.crypto.domain

data class Coin(
    val id: String,
    val rank: Int,
    val name: String,
    val symbol: String,
    val marketCapUsd: String,
    val priceUsd: String,
    val changePercent24Hr: String
)
