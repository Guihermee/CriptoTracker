package br.com.cerniauskas.criptotracker.crypto.presentation.coin_list

import br.com.cerniauskas.criptotracker.crypto.presentation.models.CoinUi

sealed interface CoinListActions {
    data class onCoinClick(val coinUi: CoinUi): CoinListActions
}