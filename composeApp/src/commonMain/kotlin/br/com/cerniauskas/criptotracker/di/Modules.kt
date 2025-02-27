package br.com.cerniauskas.criptotracker.di

import br.com.cerniauskas.criptotracker.core.data.HttpClientFactory
import br.com.cerniauskas.criptotracker.crypto.data.network.RemoteCoinDataSource
import br.com.cerniauskas.criptotracker.crypto.domain.CoinDataSource
import br.com.cerniauskas.criptotracker.crypto.presentation.coin_list.CoinListViewModel
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.bind
import org.koin.dsl.module

expect val platformModule: Module

val sharedModule = module {
    single { HttpClientFactory.create(get()) }
    singleOf(::RemoteCoinDataSource).bind<CoinDataSource>()

    viewModelOf(::CoinListViewModel)
}
