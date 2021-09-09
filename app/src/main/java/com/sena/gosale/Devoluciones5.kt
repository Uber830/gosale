package com.sena.gosale

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Devoluciones5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_devoluciones5)

        MyToolbar().show(this, "Devoluciones", true)
    }
}