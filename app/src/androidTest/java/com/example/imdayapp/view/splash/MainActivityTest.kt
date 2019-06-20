package com.example.imdayapp.view.splash

import android.content.Intent
import androidx.test.filters.MediumTest
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@MediumTest
class MainActivityTest {

    @get:Rule
    var activityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    private val robot: MainActivityRobot = MainActivityRobot()

    @Before
    fun init() {
        activityRule.launchActivity(Intent())
    }

    @Test
    fun testSplash_isOpened() {
        robot
            .checkSplashIconIsVisible()
            .checkSplashDescriptionIsVisible()
    }

    @Test
    fun testSplash_hasCalledNextScreen() {
        robot
            .waitSplashEnd()
            .checkIncidentManagerIsListed()
//            .checkNavigationIsActive()
    }
}