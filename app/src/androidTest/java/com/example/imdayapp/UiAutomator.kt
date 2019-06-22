package com.example.imdayapp

import androidx.annotation.IdRes
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.DrawerActions.open
import androidx.test.espresso.matcher.ViewMatchers.*

object UiAutomator {

    fun checkIdIsDisplayed(@IdRes id: Int) {
        onView(withId(id)).check(matches(isDisplayed()))
    }

    fun waitView(time: Long) {
        Thread.sleep(time)
    }

    fun checkTextIsDisplayed(text: String) {
        onView(withText(text)).check(matches(isDisplayed()))
    }

    fun openDrawerById(@IdRes id: Int) {
        onView(withId(id)).perform(open())
    }

    fun clickByText(text: String) {
        onView(withText(text)).perform(click())
    }

}