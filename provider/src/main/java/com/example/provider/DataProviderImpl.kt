package com.example.provider

import android.content.res.AssetManager
import com.example.utility.extension.getNameOfDay
import com.example.utility.model.IncidentManagerItem
import org.json.JSONObject
import java.io.InputStream
import java.text.SimpleDateFormat
import java.util.*

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
            val calendar = Calendar.getInstance()
            calendar.time = SimpleDateFormat("dd/MM/yy").parse(key)
            incidentManagerList.add(
                IncidentManagerItem(
                    calendar.getNameOfDay() + " ($key)",
                    incidentManagerItem.get(key).toString()
                )
            )
        }

        return incidentManagerList
    }

}