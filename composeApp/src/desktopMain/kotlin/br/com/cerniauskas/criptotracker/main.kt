package br.com.cerniauskas.criptotracker

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import br.com.cerniauskas.criptotracker.app.App

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "CriptoTracker",
    ) {
        App()
    }
}