package com.example.imdayapp.about

import android.content.res.Resources
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AboutViewModel : ViewModel() {

    private var _aboutDescription = MutableLiveData<String>()

    val aboutDescription: LiveData<String>
        get() = _aboutDescription

    fun init() {
        _aboutDescription.value = EXPLAIN_TEXT
    }

    companion object {
        const val EXPLAIN_TEXT = "Este app contém uma listagem de responsáveis por solucionar incidentes e suas respectivas datas"
    }
}