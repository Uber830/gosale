package com.sena.gosale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class ClientesInformacionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clientes_informacion)

        val botonUbica = findViewById<ImageView>(R.id.btnUbicacion)
        val botonProducto = findViewById<ImageView>(R.id.btnCompra)

        botonUbica.setOnClickListener {
            val ventanaUbicacion = Intent(this, ClientesInformacionDescripcionActivity::class.java)
            startActivity(ventanaUbicacion)

            Toast.makeText(applicationContext, "Ubucacion Pulsado", Toast.LENGTH_SHORT).show()
        }

        botonProducto.setOnClickListener {
            val ventanaProducto = Intent(this, ProductoActivity::class.java)
            startActivity(ventanaProducto)

            Toast.makeText(applicationContext, "Carrito Pulsado", Toast.LENGTH_SHORT).show()
        }
    }
}