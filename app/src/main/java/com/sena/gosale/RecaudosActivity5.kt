package com.sena.gosale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RecaudosActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recaudos5)

       // MyToolbar().show(this, "Recaudos", true)
        val recaudo = findViewById<Button>(R.id.btnEnviar)

        recaudo.setOnClickListener() {
            val ventanaRecaudo = Intent(this, RecaudosActivity6::class.java)
            startActivity(ventanaRecaudo)
        }
    }
}