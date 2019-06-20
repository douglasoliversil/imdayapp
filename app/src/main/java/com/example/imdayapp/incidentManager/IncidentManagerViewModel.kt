package com.example.imdayapp.incidentManager

import android.content.res.AssetManager
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.business.DataProvider
import com.example.business.DataProviderImpl
import com.example.infrastructure.model.IncidentManagerItem

class IncidentManagerViewModel : ViewModel() {

    private lateinit var mProvider: DataProvider

    private val _managers = MutableLiveData<List<IncidentManagerItem>>()

    val managers: LiveData<List<IncidentManagerItem>>
        get() = _managers

    fun init(assetManager: AssetManager) {

        mProvider = DataProviderImpl(assetManager)

        _managers.value = mProvider.getIncidentManagers()
    }
}