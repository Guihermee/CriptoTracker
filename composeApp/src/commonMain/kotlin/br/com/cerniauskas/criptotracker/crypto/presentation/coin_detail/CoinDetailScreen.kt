package br.com.cerniauskas.criptotracker.crypto.presentation.coin_detail

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import br.com.cerniauskas.criptotracker.crypto.presentation.coin_detail.components.InfoCard
import br.com.cerniauskas.criptotracker.crypto.presentation.coin_list.CoinListState
import br.com.cerniauskas.criptotracker.crypto.presentation.models.toDisplayableNumber
import br.com.cerniauskas.criptotracker.ui.theme.greenBackground
import criptotracker.composeapp.generated.resources.Res
import criptotracker.composeapp.generated.resources.change_last_24_h
import criptotracker.composeapp.generated.resources.dollar
import criptotracker.composeapp.generated.resources.market_cap
import criptotracker.composeapp.generated.resources.price
import criptotracker.composeapp.generated.resources.stock
import criptotracker.composeapp.generated.resources.trending
import criptotracker.composeapp.generated.resources.trending_down
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.resources.vectorResource



@OptIn(ExperimentalLayoutApi::class)
@Composable
fun CoinDetailScreen(
    state: CoinListState,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        if (state.isLoading) {
            CircularProgressIndicator()
        } else if (state.selectedCoin != null) {
            Column(
                modifier = modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                val coin = state.selectedCoin
                Icon(
                    painter = painterResource(coin.iconRes),
                    contentDescription = coin.name,
                    modifier = Modifier.size(100.dp),
                    tint = MaterialTheme.colorScheme.primary
                )
                Text(
                    text = coin.name,
                    style = MaterialTheme.typography.headlineLarge.copy(fontWeight = FontWeight.Bold),
                    textAlign = TextAlign.Center,
                    color = MaterialTheme.colorScheme.onBackground
                )
                Text(
                    text = coin.symbol,
                    style = MaterialTheme.typography.titleLarge,
                    textAlign = TextAlign.Center,
                    color = MaterialTheme.colorScheme.onBackground
                )

                FlowRow(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    InfoCard(
                        title = stringResource(Res.string.market_cap),
                        formattedText = "$ ${coin.marketCapUsd.formatted}",
                        icon = vectorResource(Res.drawable.stock)
                    )
                    InfoCard(
                        title = stringResource(Res.string.price),
                        formattedText = "$ ${coin.priceUsd.formatted}",
                        icon = vectorResource(Res.drawable.dollar)
                    )
                    val absoluteChangeFormatted = (
                            coin.priceUsd.value * (coin.changePercent24Hr.value / 100))
                        .toDisplayableNumber()
                    val isPositive = coin.changePercent24Hr.value > 0.0
                    val contentColor = if (isPositive) {
                        if (isSystemInDarkTheme()) Color.Green else greenBackground
                    } else {
                        MaterialTheme.colorScheme.error
                    }
                    InfoCard(
                        title = stringResource(Res.string.change_last_24_h),
                        formattedText = absoluteChangeFormatted.formatted,
                        icon = if (isPositive) vectorResource(Res.drawable.trending) else
                            vectorResource(Res.drawable.trending_down),
                        contentColor = contentColor
                    )
                }

            }
        }
    }
}