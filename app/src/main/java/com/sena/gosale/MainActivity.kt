package com.sena.gosale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MyToolbar().show(this, "Estados de Cuenta", true)

        //variables
        val producto = findViewById<Button>(R.id.btnProducto)
        val cliente = findViewById<Button>(R.id.btnCliente)
        val visita = findViewById<Button>(R.id.btnVisita)
        val orden = findViewById<Button>(R.id.btnOrden)
        val recaudo = findViewById<Button>(R.id.btnRecaudo)
        val devolucion = findViewById<Button>(R.id.btnDevolicion)
        val estadistica = findViewById<Button>(R.id.btnEstadistica)


        producto.setOnClickListener {
           val ventanaProducto = Intent(this, ProductoActivity::class.java)
            startActivity(ventanaProducto)

            Toast.makeText(applicationContext, "Producto Pulsado", Toast.LENGTH_SHORT).show()
        }

        cliente.setOnClickListener {
            val ventanaCliente = Intent(this, ClientesActivity::class.java)
            startActivity(ventanaCliente)

            Toast.makeText(applicationContext, "Clientes Pulsado", Toast.LENGTH_SHORT).show()
        }

        visita.setOnClickListener {
            val ventanaVisita = Intent(this, Activity_vista::class.java)
            startActivity(ventanaVisita)

            Toast.makeText(applicationContext, "Visitas Pulsado", Toast.LENGTH_SHORT).show()
        }

        orden.setOnClickListener {
            val ventanaOrden = Intent(this, OrdenesActivity::class.java)
            startActivity(ventanaOrden)

            Toast.makeText(applicationContext, "Ordenes Pulsado", Toast.LENGTH_SHORT).show()
        }

        recaudo.setOnClickListener {
            val ventanaRecaudo = Intent(this, RecaudosActivity::class.java)
            startActivity(ventanaRecaudo)

            Toast.makeText(applicationContext, "Recaudos Pulsado", Toast.LENGTH_SHORT).show()
        }

        devolucion.setOnClickListener {
            val ventanaDevolucion = Intent(this, DevolucionesActivity::class.java)
            startActivity(ventanaDevolucion)

            Toast.makeText(applicationContext, "Devoluciones Pulsado", Toast.LENGTH_SHORT).show()
        }

        estadistica.setOnClickListener {
            val ventanaEstadistica = Intent(this, EstadisticasActivity::class.java)
            startActivity(ventanaEstadistica)

            Toast.makeText(applicationContext, "Estadisticas Pulsado", Toast.LENGTH_SHORT).show()
        }
    }
}