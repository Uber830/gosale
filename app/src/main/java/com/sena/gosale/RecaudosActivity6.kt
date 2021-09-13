package com.sena.gosale

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class RecaudosActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recaudos6)

        MyToolbar().show(this, "Recaudos", true)
    }
}