package br.com.cerniauskas.criptotracker.app

import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import br.com.cerniauskas.criptotracker.crypto.presentation.coin_detail.CoinDetailScreen
import br.com.cerniauskas.criptotracker.crypto.presentation.coin_list.CoinListScreenRoot
import br.com.cerniauskas.criptotracker.crypto.presentation.coin_list.CoinListViewModel
import com.plcoding.cryptotracker.ui.theme.CryptoTrackerTheme
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.viewmodel.koinViewModel

@Composable
@Preview
fun App() {
    CryptoTrackerTheme {
        Surface {
            val navController = rememberNavController()
    
            NavHost(
                navController = navController,
                startDestination = Routes.CoinGraph
            ) {
                navigation<Routes.CoinGraph>(
                    startDestination = Routes.CoinList
                ) {
                    composable<Routes.CoinList> {
                        val viewModel = koinViewModel<CoinListViewModel>()
                        CoinListScreenRoot(
                            viewModel = viewModel,
                            onCoinClick = {
                                navController.navigate(Routes.CoinDetail)
                            }
                        )
                    }
                    composable<Routes.CoinDetail> {
//                        CoinDetailScreen(
//                            state = TODO()
//                        )
                    }
                }
            }
        }
    }
}