package br.com.cerniauskas.criptotracker.crypto.presentation.coin_list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.compose.LocalLifecycleOwner
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.repeatOnLifecycle
import br.com.cerniauskas.criptotracker.crypto.presentation.coin_list.components.CoinListItem
import br.com.cerniauskas.criptotracker.crypto.presentation.models.CoinUi
import criptotracker.composeapp.generated.resources.Res
import criptotracker.composeapp.generated.resources.error_unknown_error
import kotlinx.coroutines.launch
import org.jetbrains.compose.resources.stringResource

@Composable
fun CoinListScreenRoot(
    viewModel: CoinListViewModel,
    onCoinClick: (CoinUi) -> Unit
) {
    val scope = rememberCoroutineScope()
    val snackbarHostState = remember { SnackbarHostState() }
    val state by viewModel.state.collectAsStateWithLifecycle()
    val lifecycleOwner = LocalLifecycleOwner.current
    LaunchedEffect(lifecycleOwner.lifecycle) {
        lifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
            viewModel.events.collect { event ->
                when (event) {
                    is CoinListEvent.Error -> {
                        scope.launch {
                            snackbarHostState.showSnackbar(event.message.toString())
                        }
                    }
                }
            }
        }
    }

    Scaffold(
        snackbarHost = {
            SnackbarHost(hostState = snackbarHostState)
        }
    ) {
        CoinListScreen(
            state = state,
            onAction = { action ->
                when (action) {
                    is CoinListActions.onCoinClick -> onCoinClick(action.coinUi)
                    else -> Unit
                }
                viewModel.onAction(action)
            },
            modifier = Modifier
                .background(MaterialTheme.colorScheme.background)
        )
    }
}

@Composable
fun CoinListScreen(
    state : CoinListState,
    onAction: (CoinListActions) -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        if (state.isLoading) {
            CircularProgressIndicator()
        } else {
            when {
                state.errorMessage != null -> {
                    Text(
                        state.errorMessage.asString(),
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.headlineSmall,
                        color = MaterialTheme.colorScheme.errorContainer
                    )
                }
                state.coins.isEmpty() -> {
                    Text(
                        text = stringResource(Res.string.error_unknown_error),
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.headlineSmall,
                        color = MaterialTheme.colorScheme.errorContainer
                    )
                }
                else -> {
                    Column(
                        modifier = Modifier
                            .widthIn(max = 700.dp)
                            .fillMaxWidth()
                    ) {
                        LazyColumn(
                            modifier = modifier
                                .fillMaxSize(),
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            items(state.coins) { coinUi ->
                                CoinListItem(
                                    coinUi = coinUi,
                                    onClickCoin = {},
                                    modifier = Modifier.fillMaxWidth()
                                )
                                HorizontalDivider(
                                   color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.5f)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}