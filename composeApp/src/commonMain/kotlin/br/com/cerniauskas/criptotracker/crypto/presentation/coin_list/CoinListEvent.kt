package br.com.cerniauskas.criptotracker.crypto.presentation.coin_list

import br.com.cerniauskas.criptotracker.core.domain.NetworkError

sealed interface CoinListEvent {
    data class Error(val message: NetworkError): CoinListEvent
}