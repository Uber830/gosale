package com.sena.gosale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DevolucionesActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_devoluciones2)

        MyToolbar().show(this, "Devoluciones", true)
        val devolucion = findViewById<Button>(R.id.btnPasar3)

        devolucion.setOnClickListener() {
            val ventanaDevolucion = Intent(this, DevolucionesActivity3::class.java)
            startActivity(ventanaDevolucion)
        }
    }
}