package br.com.cerniauskas.criptotracker.crypto.domain

import br.com.cerniauskas.criptotracker.core.domain.NetworkError
import br.com.cerniauskas.criptotracker.core.domain.Result
import kotlinx.datetime.LocalDateTime

interface CoinDataSource {
    suspend fun getCoins(): Result<List<Coin>, NetworkError>
    suspend fun getCoinHistory(
        coinId: String,
        start: LocalDateTime,
        end: LocalDateTime
    ): Result<List<CoinPrice>, NetworkError>
}