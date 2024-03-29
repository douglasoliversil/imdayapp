package com.example.imdayapp.view.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.imdayapp.R
import com.example.imdayapp.view.navigation.NavigationActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupSplashHandler()
    }

    private fun setupSplashHandler() {
        Handler().postDelayed({
            startActivity(Intent(this, NavigationActivity::class.java))
            finish()
        }, SPLASH_DELAY_TIME)
    }

    companion object {
        const val SPLASH_DELAY_TIME = 3000L
    }
}
