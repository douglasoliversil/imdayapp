package com.example.imdayapp

import android.content.Intent
import androidx.test.filters.FlakyTest
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import com.example.imdayapp.view.navigation.NavigationActivity
import org.junit.Before
import org.junit.FixMethodOrder
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.MethodSorters

@LargeTest
@RunWith(AndroidJUnit4::class)
@FixMethodOrder(MethodSorters.JVM)
class NavigationActivityTest {

    @Rule
    @JvmField
    var activityRule: ActivityTestRule<NavigationActivity> = ActivityTestRule(NavigationActivity::class.java)

    private val robot: BaseRobot = BaseRobot()

    @Before
    fun init() {
        activityRule.launchActivity(Intent())
    }

    @Test
    fun testNavigation_showBeOpenDrawer() {
        robot
            .openDrawer()
            .checkDrawerOptionsIsVisible()
    }

    @Test
    fun testNavigation_shouldBeListIncidentManagers() {
        robot
            .checkListItensIsDisplayed()
    }

    @FlakyTest
    fun testNavigation_shouldBeOpenAboutScreen() {
        robot
            .openDrawer()
            .openAboutOption()
            .checkAboutDescription()
    }

    @Test
    fun testNavigation_shouldBeOpenListScreenAfterAboutScreenIsDisplayed() {
        robot
            .openDrawer()
            .openAboutOption()
            .openDrawer()
            .openListOption()
            .checkListItensIsDisplayed()
    }
}