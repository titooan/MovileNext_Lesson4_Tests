package com.titouan.next.movilenext_lesson4_loginapp

import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.titouan.next.movilenext_lesson4_loginapp.robot.LoginRobot
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LoginActivityRobotTest {

    @get:Rule
    var rule = ActivityTestRule(LoginActivity::class.java)
    private lateinit var robot: LoginRobot

    @Before
    fun setUp() {
        robot = LoginRobot(rule.activity)
    }

    @Test
    fun loginSuccess() {
        robot.apply {
            setEmail("admin@admin.com")
            setPassword("admin")
            clickLogin()
            matchText(R.id.status, "Titouan")
        }
    }
}