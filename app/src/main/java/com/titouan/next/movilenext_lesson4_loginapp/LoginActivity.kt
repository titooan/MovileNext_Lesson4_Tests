package com.titouan.next.movilenext_lesson4_loginapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login.setOnClickListener {
            if (email.text.toString() == "admin@admin.com") {
                status.text = "Titouan"
            } else {
                status.text = "Error"
            }
        }
    }
}
