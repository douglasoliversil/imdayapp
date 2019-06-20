package com.example.imdayapp.view.navigation

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import com.example.imdayapp.R
import com.example.imdayapp.view.about.AboutFragment
import com.example.imdayapp.view.incidentManager.IncidentManagerFragment
import com.example.utility.extension.callFragment
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_navigation.*
import kotlinx.android.synthetic.main.app_bar_navigation.*

class NavigationActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_navigation)

        val toggle = ActionBarDrawerToggle(
            this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        navView.setNavigationItemSelectedListener(this)
        callFragment(R.id.frameContent, IncidentManagerFragment())
    }

    override fun onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.drawerList -> {
                callFragment(R.id.frameContent, IncidentManagerFragment())
            }
            R.id.drawerAbout -> {
                callFragment(R.id.frameContent, AboutFragment())
            }
        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
}
