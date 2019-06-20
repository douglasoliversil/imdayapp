package com.example.imdayapp.injection

import com.example.imdayapp.view.about.AboutViewModel
import com.example.imdayapp.view.incidentManager.IncidentManagerViewModel
import com.example.provider.DataProvider
import com.example.provider.DataProviderImpl
import org.koin.android.ext.koin.androidContext
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

class AppModule {
    companion object {
        val APPLICATION_MODULE = module {

            single<DataProvider> { DataProviderImpl(androidContext().assets) }

            viewModel { AboutViewModel(androidContext().resources) }
            viewModel { IncidentManagerViewModel(get()) }

        }
    }
}