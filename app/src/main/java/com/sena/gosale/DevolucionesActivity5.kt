package com.sena.gosale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DevolucionesActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_devoluciones5)

        MyToolbar().show(this, "Devoluciones", true)
        val devolucion = findViewById<Button>(R.id.btnEnviar)

        devolucion.setOnClickListener() {
            val ventanaDevolucion = Intent(this, DevolucionesActivity6::class.java)
            startActivity(ventanaDevolucion)
        }
    }
}