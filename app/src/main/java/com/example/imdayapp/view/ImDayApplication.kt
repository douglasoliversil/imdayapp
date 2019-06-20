package com.example.imdayapp.view

import android.app.Application
import com.example.imdayapp.injection.AppModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class ImDayApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@ImDayApplication)
            modules(AppModule.APPLICATION_MODULE)
        }
    }

}