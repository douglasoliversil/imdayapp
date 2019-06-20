package com.example.imdayapp.view.splash

import com.example.imdayapp.R
import com.example.imdayapp.view.navigation.NavigationActivity


class MainActivityRobot {

    fun checkSplashIconIsVisible(): MainActivityRobot {
        UiAutomator.checkIdIsDisplayed(R.id.main_icon)
        return this
    }

    fun checkSplashDescriptionIsVisible(): MainActivityRobot {
        UiAutomator.checkIdIsDisplayed(R.id.main_title)
        return this
    }

    fun waitSplashEnd(): MainActivityRobot {
        UiAutomator.waitView(4000L)
        return this
    }

    fun checkNavigationIsActive(): MainActivityRobot {
        UiAutomator.checkActivityIsActive(NavigationActivity::class.java)
        return this
    }

    fun checkIncidentManagerIsListed(): MainActivityRobot {
        UiAutomator.checkIdIsDisplayed(R.id.manager)
        return this
    }
}