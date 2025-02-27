package br.com.cerniauskas.criptotracker.app

import kotlinx.serialization.Serializable

sealed interface Routes {

    @Serializable
    data object CoinGraph: Routes

    @Serializable
    data object CoinList: Routes

    @Serializable
    data object CoinDetail: Routes

}