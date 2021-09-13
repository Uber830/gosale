package com.sena.gosale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class VisitaActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visita2)

        val botonPasar = findViewById<Button>(R.id.btnPasarVisita)

        botonPasar.setOnClickListener{
            val ventanaPasar = Intent(this, VisitafinalActivity::class.java)
            startActivity(ventanaPasar)
        }

    }
}