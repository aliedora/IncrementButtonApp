package com.e.incrementbuttonapp

import android.content.Intent
import android.util.Log
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.matcher.IntentMatchers.hasAction
import androidx.test.espresso.intent.matcher.IntentMatchers.hasData
import androidx.test.espresso.intent.matcher.UriMatchers.hasHost
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.rule.ActivityTestRule
import com.e.incrementbuttonapp.MainActivity.Companion.OK_URL
import io.qameta.allure.android.runners.AllureAndroidJUnit4
import io.qameta.allure.kotlin.Step
import org.hamcrest.CoreMatchers.allOf
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AllureAndroidJUnit4::class)
class TestOpenLink {

    @Rule
    @JvmField
    val mActivityRule = ActivityTestRule(MainActivity::class.java)

//    @get:Rule
//    val intentsTestRule = IntentsTestRule(MainActivity::class.java)

    @Test
    @Step
    fun testOpenLink() {
        Espresso.onView(ViewMatchers.withId(R.id.link))
            .check(ViewAssertions.matches(ViewMatchers.withText(OK_URL)))
        Espresso.onView(ViewMatchers.withId(R.id.link)).perform(ViewActions.click())
        Thread.sleep(1000)
        intended(
            allOf(
                hasData(hasHost(equalTo("m.ok.ru"))),
                hasAction(Intent.ACTION_VIEW)
            )
        )
        Log.d("end", "Success")
    }
}