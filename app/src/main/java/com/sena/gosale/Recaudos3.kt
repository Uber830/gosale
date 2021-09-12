package com.sena.gosale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Recaudos3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recaudos3)

        MyToolbar().show(this, "Recaudos", true)

        val botonPasar = findViewById<Button>(R.id.btnPasar3)

        botonPasar.setOnClickListener{
            val ventanaPasar = Intent(this, Recaudos4::class.java)
            startActivity(ventanaPasar)
        }
    }
}