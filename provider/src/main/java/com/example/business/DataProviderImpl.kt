package com.example.business

import android.content.res.AssetManager
import com.example.infrastructure.model.IncidentManagerItem
import org.json.JSONObject
import java.io.InputStream

class DataProviderImpl(private val mAssetManager: AssetManager) : DataProvider {

    override fun getIncidentManagers(): List<IncidentManagerItem> {

        val inputStream: InputStream = mAssetManager.open("imday.json")

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

        return incidentManagerList
    }

}