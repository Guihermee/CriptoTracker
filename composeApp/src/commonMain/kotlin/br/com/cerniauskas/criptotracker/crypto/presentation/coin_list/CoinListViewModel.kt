package br.com.cerniauskas.criptotracker.crypto.presentation.coin_list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.cerniauskas.criptotracker.core.domain.onError
import br.com.cerniauskas.criptotracker.core.domain.onSuccess
import br.com.cerniauskas.criptotracker.core.presentation.toUiText
import br.com.cerniauskas.criptotracker.crypto.domain.CoinDataSource
import br.com.cerniauskas.criptotracker.crypto.presentation.models.CoinUi
import br.com.cerniauskas.criptotracker.crypto.presentation.models.toCoinUi
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.datetime.Clock
import kotlinx.datetime.DateTimeUnit
import kotlinx.datetime.TimeZone
import kotlinx.datetime.minus
import kotlinx.datetime.toLocalDateTime

class CoinListViewModel(
    private val coinDataSource: CoinDataSource
) : ViewModel() {

    private val _state = MutableStateFlow(CoinListState())
    val state = _state
        .onStart {
            loadCoins()
        }
        .stateIn(
            viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = CoinListState()
        )

    private val _events = Channel<CoinListEvent>()
    val events = _events.receiveAsFlow()

    fun onAction(actions: CoinListActions) {
        when (actions) {
            is CoinListActions.onCoinClick -> {
                selectCoin(actions.coinUi)
            }
        }
    }

    private fun selectCoin(coinUi: CoinUi) {
        _state.update { it.copy(selectedCoin = coinUi) }

        viewModelScope.launch {
            coinDataSource
                .getCoinHistory(
                    coinId = coinUi.id,
                    start = Clock.System.now().minus((24 * 5), DateTimeUnit.HOUR).toLocalDateTime(TimeZone.UTC),
                    end = Clock.System.now().toLocalDateTime(TimeZone.UTC)
                )
                .onSuccess { history ->
                    println(history)
                }
                .onError { error ->
                    _state.update {
                        it.copy(
                            isLoading = false,
                            errorMessage = error.toUiText()
                        )
                    }
                    _events.send(CoinListEvent.Error(error))
                }
        }
    }

    private fun loadCoins() {
        viewModelScope.launch {
            _state.update {
                it.copy(
                    isLoading = true
                )
            }

            coinDataSource
                .getCoins()
                .onSuccess { coins ->
                    println(coins)
                    _state.update {
                        it.copy(
                            coins = coins.map { coin ->
                                coin.toCoinUi()
                            },
                            isLoading = false
                        )
                    }
                }
                .onError { error ->
                    _state.update {
                        it.copy(
                            isLoading = false,
                            errorMessage = error.toUiText()
                        )
                    }
                    _events.send(CoinListEvent.Error(error))
                }
        }
    }

}