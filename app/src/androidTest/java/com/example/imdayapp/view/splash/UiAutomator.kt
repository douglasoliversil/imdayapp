package com.example.imdayapp.view.splash

import android.app.Activity
import androidx.annotation.IdRes
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.matcher.IntentMatchers
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId

object UiAutomator {

    fun checkIdIsDisplayed(@IdRes id: Int) {
        onView(withId(id)).check(matches(isDisplayed()))
    }

    fun waitView(time: Long) {
        Thread.sleep(time)
    }

    fun <T : Activity?> checkActivityIsActive(activity: Class<T>) {
        intended(IntentMatchers.hasComponent(activity.name))
    }

}