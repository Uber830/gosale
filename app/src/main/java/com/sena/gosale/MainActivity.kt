package com.sena.gosale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.sena.gosale.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var main:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        main = ActivityMainBinding.inflate(layoutInflater)
        setContentView(main.root)

        main.btnProducto.setOnClickListener{ producto() }
        main.btnCliente.setOnClickListener{ cliente() }
        main.btnVisita.setOnClickListener{ visita() }
        main.btnOrden.setOnClickListener{ orden() }
        main.btnRecaudo.setOnClickListener{ recaudo() }
        main.btnDevolicion.setOnClickListener{ devolucion() }
        main.btnEstadistica.setOnClickListener{ estadistica() }
    }


   private fun producto() {
        val ventanaProducto = Intent(this, ProductoActivity::class.java)
        startActivity(ventanaProducto)

        Toast.makeText(applicationContext, "Products", Toast.LENGTH_SHORT).show()
    }
    private fun cliente() {
        val ventanaCliente = Intent(this, ClientesActivity::class.java)
        startActivity(ventanaCliente)

        Toast.makeText(applicationContext, "Clients", Toast.LENGTH_SHORT).show()
    }

    private fun visita() {
        val ventanaVisita = Intent(this, VisitaActivity::class.java)
        startActivity(ventanaVisita)

        Toast.makeText(applicationContext, "Visits", Toast.LENGTH_SHORT).show()
    }

    private fun orden() {
        val ventanaOrden = Intent(this, OrdenesActivity::class.java)
        startActivity(ventanaOrden)

        Toast.makeText(applicationContext, "Orders", Toast.LENGTH_SHORT).show()
    }

    private fun recaudo() {
        val ventanaRecaudo = Intent(this, RecaudosActivity::class.java)
        startActivity(ventanaRecaudo)

        Toast.makeText(applicationContext, "Records", Toast.LENGTH_SHORT).show()
    }

    private fun devolucion() {
        val ventanaDevolucion = Intent(this, DevolucionesActivity::class.java)
        startActivity(ventanaDevolucion)

        Toast.makeText(applicationContext, "Devolution's", Toast.LENGTH_SHORT).show()
    }

    private fun estadistica() {
        val ventanaEstadistica = Intent(this, EstadisticasActivity::class.java)
        startActivity(ventanaEstadistica)

        Toast.makeText(applicationContext, "Statistics", Toast.LENGTH_SHORT).show()
    }
}