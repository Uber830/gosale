package com.sena.gosale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DevolucionesActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_devoluciones4)

     //   MyToolbar().show(this, "Devoluciones", true)
        val devolucion = findViewById<Button>(R.id.btnGenerar)

        devolucion.setOnClickListener() {
            val ventanaDevolucion = Intent(this, DevolucionesActivity5::class.java)
            startActivity(ventanaDevolucion)
        }
    }
}