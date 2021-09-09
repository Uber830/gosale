package com.sena.gosale

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Devoluciones : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_devoluciones)

        MyToolbar().show(this, "Devoluciones", true)
    }
}