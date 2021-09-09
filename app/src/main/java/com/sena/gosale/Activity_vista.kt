package com.sena.gosale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity_vista : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vista)

        val botonCliente = findViewById<Button>(R.id.btnCliente)

        botonCliente.setOnClickListener{
            val ventanaCliente = Intent(this, Activity_visita1::class.java)
            startActivity(ventanaCliente)
        }
    }
}