package br.com.cerniauskas.criptotracker.crypto.presentation.coin_list.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.com.cerniauskas.criptotracker.crypto.presentation.models.CoinUi
import org.jetbrains.compose.resources.painterResource

@Composable
fun CoinListItem(
    coinUi: CoinUi,
    onClickCoin: () -> Unit,
    modifier: Modifier = Modifier
) {
   Row(
       modifier = modifier
           .clickable(onClick = onClickCoin)
           .padding(16.dp),
       verticalAlignment = Alignment.CenterVertically,
       horizontalArrangement = Arrangement.spacedBy(16.dp)
   ) {
       Icon(
           painter = painterResource(coinUi.iconRes),
           contentDescription = coinUi.name,
           tint = MaterialTheme.colorScheme.primary,
           modifier = Modifier.size(85.dp)
       )
       Column(
           modifier = Modifier.weight(1f)
       ) {
           Text(
               text = coinUi.symbol,
               style = MaterialTheme.typography.titleLarge,
               color = MaterialTheme.colorScheme.onBackground
           )
           Text(
               text = coinUi.name,
               style = MaterialTheme.typography.bodyMedium,
               color = MaterialTheme.colorScheme.onBackground
           )
       }
       Column(
           horizontalAlignment = Alignment.End
       ) {
           Text(
               text = "$ ${coinUi.priceUsd.formatted}",
               style = MaterialTheme.typography.titleMedium,
               color = MaterialTheme.colorScheme.onBackground
           )
           Spacer(modifier = Modifier.height(8.dp))
           PriceChange(coinUi.changePercent24Hr)
       }
   }
}