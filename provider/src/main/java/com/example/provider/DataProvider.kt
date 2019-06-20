package com.example.provider

import com.example.utility.model.IncidentManagerItem

interface DataProvider {
    fun getIncidentManagers() : List<IncidentManagerItem>
}