package com.sena.gosale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RecaudosActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recaudos4)

        MyToolbar().show(this, "Recaudos", true)
        val recaudo = findViewById<Button>(R.id.btnRecaudo)

        recaudo.setOnClickListener() {
            val ventanaRecaudo = Intent(this, RecaudosActivity5::class.java)
            startActivity(ventanaRecaudo)
        }
    }
}