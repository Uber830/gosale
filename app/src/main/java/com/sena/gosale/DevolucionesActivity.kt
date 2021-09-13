package com.sena.gosale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DevolucionesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_devoluciones)

        MyToolbar().show(this, "Devoluciones", true)
        val devolucion = findViewById<Button>(R.id.btnNvDevolucion)

        devolucion.setOnClickListener() {
            val ventanaDevolucion = Intent(this, DevolucionesActivity2::class.java)
            startActivity(ventanaDevolucion)
        }

    }
}