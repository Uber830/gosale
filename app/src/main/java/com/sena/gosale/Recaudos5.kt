package com.sena.gosale

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Recaudos5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recaudos5)

        MyToolbar().show(this, "Recaudos", true)
    }
}