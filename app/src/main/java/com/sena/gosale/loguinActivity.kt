package com.sena.gosale

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class loguinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        //codigo del splashcreen
        setTheme(R.style.Theme_Gosale)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loguin)

    }
}