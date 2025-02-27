package br.com.cerniauskas.criptotracker

import android.app.Application
import br.com.cerniauskas.criptotracker.di.initKoin
import org.koin.android.ext.koin.androidContext

class CriptoTrackerApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@CriptoTrackerApplication)
        }
    }
}