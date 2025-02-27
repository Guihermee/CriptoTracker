package br.com.cerniauskas.criptotracker.crypto.presentation.coin_list

import androidx.compose.runtime.Immutable
import br.com.cerniauskas.criptotracker.core.presentation.UiText
import br.com.cerniauskas.criptotracker.crypto.presentation.models.CoinUi

@Immutable
data class CoinListState(
    val isLoading: Boolean = true,
    val coins: List<CoinUi> = emptyList(),
    val selectedCoin: CoinUi? = null,
    val errorMessage: UiText? = null
)
