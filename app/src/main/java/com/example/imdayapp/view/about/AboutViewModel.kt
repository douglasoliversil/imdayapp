package com.example.imdayapp.view.about

import android.content.res.Resources
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.imdayapp.R

class AboutViewModel constructor(private val resources: Resources) : ViewModel() {

    private var _aboutDescription = MutableLiveData<String>()

    val aboutDescription: LiveData<String>
        get() = _aboutDescription

    fun init() {
        _aboutDescription.value = resources.getString(R.string.about_description)
    }

}