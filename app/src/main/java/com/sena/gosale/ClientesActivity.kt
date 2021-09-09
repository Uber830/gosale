package com.sena.gosale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ClientesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clientes)

        val botonPasar = findViewById<Button>(R.id.btnPasar)

        botonPasar.setOnClickListener{
            val ventanaPasar = Intent(this, ClientesInformacionActivity::class.java)
            startActivity(ventanaPasar)
        }
    }
}