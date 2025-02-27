package br.com.cerniauskas.criptotracker.crypto.domain

import br.com.cerniauskas.criptotracker.core.domain.NetworkError
import br.com.cerniauskas.criptotracker.core.domain.Result

interface CoinDataSource {
    suspend fun getCoins(): Result<List<Coin>, NetworkError>
}