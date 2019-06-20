package com.example.business

import com.example.infrastructure.model.IncidentManagerItem

interface DataProvider {
    fun getIncidentManagers() : List<IncidentManagerItem>
}