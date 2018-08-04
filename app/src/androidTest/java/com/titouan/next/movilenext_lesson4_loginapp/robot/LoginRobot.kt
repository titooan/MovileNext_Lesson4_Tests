package com.titouan.next.movilenext_lesson4_loginapp.robot

import android.content.Context
import android.support.annotation.StringRes
import android.support.test.espresso.ViewInteraction
import com.titouan.next.movilenext_lesson4_loginapp.R

class LoginRobot(private val context: Context) : BaseTestRobot() {

    fun setEmail(email: String) = apply {
        fillEditText(R.id.email, email) }

    fun setPassword(pass: String) = apply { fillEditText(R.id.password, pass) }

    fun clickLogin() = apply { clickButton(R.id.login) }

    fun matchErrorText(@StringRes err: Int): ViewInteraction {
        return matchText(textView(android.R.id.message), context.getString(err))
    }
}