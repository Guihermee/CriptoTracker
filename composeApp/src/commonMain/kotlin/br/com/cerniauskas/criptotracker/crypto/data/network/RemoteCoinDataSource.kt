package br.com.cerniauskas.criptotracker.crypto.data.network

import br.com.cerniauskas.criptotracker.core.data.constructUrl
import br.com.cerniauskas.criptotracker.core.data.safeCall
import br.com.cerniauskas.criptotracker.core.domain.NetworkError
import br.com.cerniauskas.criptotracker.core.domain.Result
import br.com.cerniauskas.criptotracker.core.domain.map
import br.com.cerniauskas.criptotracker.crypto.data.dto.CoinHistoryDto
import br.com.cerniauskas.criptotracker.crypto.data.dto.CoinsResponseDto
import br.com.cerniauskas.criptotracker.crypto.data.mappers.toCoin
import br.com.cerniauskas.criptotracker.crypto.domain.Coin
import br.com.cerniauskas.criptotracker.crypto.domain.CoinDataSource
import br.com.cerniauskas.criptotracker.crypto.domain.CoinPrice
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.parameter
import kotlinx.datetime.Clock
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toInstant

class RemoteCoinDataSource(
    private val httpClient: HttpClient
) : CoinDataSource {
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

    override suspend fun getCoinHistory(
        coinId: String,
        start: LocalDateTime,
        end: LocalDateTime
    ): Result<List<CoinPrice>, NetworkError> {
        val timeZone = TimeZone.UTC
        val startMillis = start.toInstant(timeZone).epochSeconds
        val endMillis = end.toInstant(timeZone).epochSeconds

        return safeCall<CoinHistoryDto> {
            httpClient.get(
                urlString = constructUrl("/assets/$coinId/history")
            ) {
                parameter("interval", "h6")
                parameter("start", startMillis)
                parameter("end", endMillis)
            }
        }.map { response ->
            response.data.map { coinPriceDto ->
                coinPriceDto.toCoinPrice()
            }
        }
    }
}