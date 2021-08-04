package com.e.incrementbuttonapp

import android.util.Log
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.rule.ActivityTestRule
import io.qameta.allure.android.runners.AllureAndroidJUnit4
import io.qameta.allure.kotlin.Step
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AllureAndroidJUnit4::class)
class TestValidateEmptyScreen {

    @Rule
    @JvmField
    val mActivityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    @Step
    fun testValidateEmptyScreen() {
        onView(withId(R.id.count)).check(matches(isDisplayed())).check(matches(withText("0")))
        onView(withId(R.id.btnIncrement)).check(matches(withText("Increment")))
            .check(matches(isClickable()))
        Log.d("end", "Success3")
    }
}