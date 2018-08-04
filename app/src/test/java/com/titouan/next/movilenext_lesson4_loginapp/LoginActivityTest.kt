package com.titouan.next.movilenext_lesson4_loginapp

import android.widget.TextView
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class LoginActivityTest {

    @Test
    fun loadActivity_shouldShowHelloWorld() {
        val activity = Robolectric.setupActivity(LoginActivity::class.java)

        val results: TextView = activity.findViewById(R.id.textView)

        assertThat(results.text.toString(), equalTo("Hello World!"))
    }

    @Test
    fun loadActivity_shouldShowHelloWorld2() {
        val activity = Robolectric.setupActivity(LoginActivity::class.java)

        val results: TextView = activity.findViewById(R.id.textView)
        val expectedText = activity.resources.getString(R.string.hello_world)

        assertThat(results.text.toString(), equalTo(expectedText))
    }
}