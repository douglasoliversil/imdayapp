package com.example.imdayapp.incidentManager

import android.content.res.Resources
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.json.JSONObject
import java.io.InputStream
import java.util.*

class IncidentManagerViewModel : ViewModel() {

    private val _managers = MutableLiveData<List<IncidentManagerItem>>()

    val managers: LiveData<List<IncidentManagerItem>>
        get() = _managers

    fun init(resources: Resources) {

        val inputStream: InputStream = resources.assets.open("imday.json")

        val buffer = ByteArray(inputStream.available())

        inputStream.read(buffer)

        inputStream.close()

        val json = String(buffer)

        val incidentManagerItem = JSONObject(json)

        val iterator = incidentManagerItem.keys()

        val incidentManagerList = mutableListOf<IncidentManagerItem>()

        while (iterator.hasNext()) {
            val key = iterator.next()
            incidentManagerList.add(IncidentManagerItem(key, incidentManagerItem.get(key).toString()))
        }

        _managers.value = incidentManagerList
    }
}