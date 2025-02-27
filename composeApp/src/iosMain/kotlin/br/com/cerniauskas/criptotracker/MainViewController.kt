package br.com.cerniauskas.criptotracker

import androidx.compose.ui.window.ComposeUIViewController
import br.com.cerniauskas.criptotracker.app.App
import br.com.cerniauskas.criptotracker.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) { App() }