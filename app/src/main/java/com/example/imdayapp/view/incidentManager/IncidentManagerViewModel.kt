package com.example.imdayapp.view.incidentManager

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.provider.DataProvider
import com.example.utility.model.IncidentManagerItem

class IncidentManagerViewModel constructor(var mProvider: DataProvider) : ViewModel() {

    private val _managers = MutableLiveData<List<IncidentManagerItem>>()

    val managers: LiveData<List<IncidentManagerItem>>
        get() = _managers

    fun init() {
        _managers.value = mProvider.getIncidentManagers()
    }
}