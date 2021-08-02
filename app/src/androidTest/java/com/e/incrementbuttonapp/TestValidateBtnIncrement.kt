package com.e.incrementbuttonapp

import android.util.Log
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import io.qameta.allure.android.runners.AllureAndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AllureAndroidJUnit4::class)
class TestValidateBtnIncrement {

    @Rule
    @JvmField
    val mActivityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun testValidateBtnIncrement() {
        onView(withId(R.id.count)).check(matches(withText("0")))
        onView(withId(R.id.btnIncrement)).perform(click())
        onView(withId(R.id.count)).check(matches(withText("1")))
        Log.d("end", "Success")
    }
}