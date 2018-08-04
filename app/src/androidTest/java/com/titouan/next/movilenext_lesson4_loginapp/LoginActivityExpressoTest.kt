package com.titouan.next.movilenext_lesson4_loginapp

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.*
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LoginActivityExpressoTest {

    @get:Rule
    val rule = ActivityTestRule(LoginActivity::class.java)

    @Test
    fun sendButton_shouldWriteName() {
        onView(withHint(R.string.email_hint)).perform(typeText("admin@admin.com"), closeSoftKeyboard())

        onView(withText(R.string.login_button)).perform(click())

        onView(withText("Titouan"))
                .check(matches(isDisplayed()))
    }

    @Test
    fun sendButton_shouldShowErrorWithWrongLogin() {
        onView(withHint(R.string.email_hint)).perform(typeText("other@admin.com"), closeSoftKeyboard())

        onView(withText(R.string.login_button)).perform(click())

        onView(withText("Error"))
                .check(matches(isDisplayed()))
    }
}