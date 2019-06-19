package com.example.imdayapp.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.imdayapp.R
import com.example.imdayapp.incidentManager.IncidentManagerActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupSplashHandler()
    }

    private fun setupSplashHandler() {
        Handler().postDelayed({
            startActivity(Intent(this, IncidentManagerActivity::class.java))
        }, SPLASH_DELAY_TIME)
    }

    companion object {
        const val SPLASH_DELAY_TIME = 3000L
    }
}
