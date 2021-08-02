package com.e.incrementbuttonapp

import android.util.Log
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TestValidateEmptyScreen {

    @Rule
    @JvmField
    val mActivityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun testValidateEmptyScreen() {
        onView(withId(R.id.count)).check(matches(isDisplayed())).check(matches(withText("0")))
        onView(withId(R.id.btnIncrement)).check(matches(withText("Incremendsfdsft")))
            .check(matches(isClickable()))
        Log.d("end", "Success3")
    }
}