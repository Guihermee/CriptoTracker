package br.com.cerniauskas.criptotracker.crypto.data.network

import br.com.cerniauskas.criptotracker.core.data.constructUrl
import br.com.cerniauskas.criptotracker.core.data.safeCall
import br.com.cerniauskas.criptotracker.core.domain.NetworkError
import br.com.cerniauskas.criptotracker.core.domain.Result
import br.com.cerniauskas.criptotracker.core.domain.map
import br.com.cerniauskas.criptotracker.crypto.data.dto.CoinsResponseDto
import br.com.cerniauskas.criptotracker.crypto.data.mappers.toCoin
import br.com.cerniauskas.criptotracker.crypto.domain.Coin
import br.com.cerniauskas.criptotracker.crypto.domain.CoinDataSource
import io.ktor.client.HttpClient
import io.ktor.client.request.get

class RemoteCoinDataSource(
    private val httpClient: HttpClient
): CoinDataSource {
    override suspend fun getCoins(): Result<List<Coin>, NetworkError> {
        return safeCall<CoinsResponseDto> {
            httpClient.get(
                urlString = constructUrl("/assets")
            )
        }.map { response ->
            response.data.map {
                it.toCoin()
            }
        }
    }
}