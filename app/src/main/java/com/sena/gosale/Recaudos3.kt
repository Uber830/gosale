package com.sena.gosale

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Recaudos3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recaudos3)

        MyToolbar().show(this, "Recaudos", true)
    }
}