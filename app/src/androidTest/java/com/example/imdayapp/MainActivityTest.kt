package com.example.imdayapp

import android.content.Intent
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import com.example.imdayapp.view.splash.MainActivity
import org.junit.Before
import org.junit.FixMethodOrder
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.MethodSorters

@LargeTest
@RunWith(AndroidJUnit4::class)
@FixMethodOrder(MethodSorters.JVM)
class MainActivityTest {

    @Rule
    @JvmField
    var activityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    private val robot: BaseRobot = BaseRobot()

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
    fun testNavigation_isOpened() {
        robot
            .waitSplashEnd()
            .checkNavigationIsOpened()
    }

}