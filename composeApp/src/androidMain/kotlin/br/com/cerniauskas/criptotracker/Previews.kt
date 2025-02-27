package br.com.cerniauskas.criptotracker

import androidx.compose.foundation.background
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import br.com.cerniauskas.criptotracker.crypto.domain.Coin
import br.com.cerniauskas.criptotracker.crypto.presentation.coin_detail.CoinDetailScreen
import br.com.cerniauskas.criptotracker.crypto.presentation.coin_detail.components.InfoCard
import br.com.cerniauskas.criptotracker.crypto.presentation.coin_list.CoinListScreen
import br.com.cerniauskas.criptotracker.crypto.presentation.coin_list.CoinListState
import br.com.cerniauskas.criptotracker.crypto.presentation.coin_list.components.CoinListItem
import br.com.cerniauskas.criptotracker.crypto.presentation.coin_list.components.PriceChange
import br.com.cerniauskas.criptotracker.crypto.presentation.models.DisplayableNumber
import br.com.cerniauskas.criptotracker.crypto.presentation.models.toCoinUi
import com.plcoding.cryptotracker.ui.theme.CryptoTrackerTheme
import criptotracker.composeapp.generated.resources.Res
import criptotracker.composeapp.generated.resources.dollar
import org.jetbrains.compose.resources.vectorResource

internal val previewCoin = Coin(
    id = "btc",
    rank = 1,
    name = "Bitcoin",
    symbol = "BTC",
    marketCapUsd = 1757383290515.43,
    priceUsd = 83579.83,
    changePercent24Hr = -0.5121407576201971
).toCoinUi()

@PreviewLightDark
@Composable
private fun CoinListItemPreview() {
    CryptoTrackerTheme {
        CoinListItem(
            coinUi = previewCoin,
            onClickCoin = {},
            modifier = Modifier
                .background(MaterialTheme.colorScheme.surface)
        )
    }
}

@PreviewLightDark
@Composable
private fun PriceChangePreview() {
    CryptoTrackerTheme {
        PriceChange(
            change = DisplayableNumber(value = 2.45, formatted = "2.45")
        )
    }
}

@PreviewLightDark
@Composable
private fun CoinListScreenPreview() {
    CryptoTrackerTheme {
        CoinListScreen(
            state = CoinListState(isLoading = false, coins = listOf(previewCoin, previewCoin)),
            onAction = {},
            modifier = Modifier.background(MaterialTheme.colorScheme.background)
        )
    }
}

@PreviewLightDark
@Composable
private fun CoinDetailScreenPreview() {
    CryptoTrackerTheme {
        CoinDetailScreen(
            state = CoinListState(isLoading = false, selectedCoin = previewCoin),
            modifier = Modifier.background(MaterialTheme.colorScheme.background)
        )
    }
}

@PreviewLightDark
@Composable
private fun InfoCardPreview() {
    CryptoTrackerTheme {
        InfoCard(
            title = "Price",
            formattedText = "$ 63,257.55",
            icon = vectorResource(Res.drawable.dollar)
        )
    }
}