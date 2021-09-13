package com.sena.gosale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity_visita1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visita1)

        val botonPasar = findViewById<Button>(R.id.btnPasarVisita)

        botonPasar.setOnClickListener{
            val ventanaPasar = Intent(this, VisitaActivity2::class.java)
            startActivity(ventanaPasar)
        }
    }
}