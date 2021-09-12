package com.sena.gosale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Recaudos2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recaudos2)

        MyToolbar().show(this, "Recaudos", true)

        val botonPasar = findViewById<Button>(R.id.btnPasar2)

        botonPasar.setOnClickListener{
            val ventanaPasar = Intent(this, Recaudos3::class.java)
            startActivity(ventanaPasar)
        }
    }
}