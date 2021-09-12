package com.sena.gosale

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class ProductoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_producto)

        /*-- variables de los productos del catalogo---*/
        val Brocha = findViewById<ImageView>(R.id.imageBrocha)
        val Rodillo = findViewById<ImageView>(R.id.imageRodillo)
        val Llana = findViewById<ImageView>(R.id.imageLlana)
        val Espatula = findViewById<ImageView>(R.id.imageEspatula)
        val Accesorio = findViewById<ImageView>(R.id.imageAccesorio)
        val Kit = findViewById<ImageView>(R.id.imageKit)
        val Galon = findViewById<ImageView>(R.id.imageGalon)
        val Win  = findViewById<ImageView>(R.id.imageWin)
        val Guante = findViewById<ImageView>(R.id.imageGuantes)
        val Nivel = findViewById<ImageView>(R.id.imageNivel)

        Brocha.setOnClickListener(){
            val ventanaBrocha = Intent(applicationContext, ProductsLineActivity::class.java)
            startActivity(ventanaBrocha)
            Toast.makeText(applicationContext, "Brocha Pulsado", Toast.LENGTH_SHORT).show()
        }
        Rodillo.setOnClickListener(){
            val ventanaRodillo = Intent(applicationContext, ProductsLineActivity::class.java)
            startActivity(ventanaRodillo)
            Toast.makeText(applicationContext, "Rodillo Pulsado", Toast.LENGTH_SHORT).show()
        }
        Llana.setOnClickListener(){
            val ventanaLlana = Intent(applicationContext, ProductsLineActivity::class.java)
            startActivity(ventanaLlana)
            Toast.makeText(applicationContext, "Llana Pulsado", Toast.LENGTH_SHORT).show()
        }
        Espatula.setOnClickListener(){
            val ventanaEspatula = Intent(applicationContext, ProductsLineActivity::class.java)
            startActivity(ventanaEspatula)
            Toast.makeText(applicationContext, "Espatula Pulsado", Toast.LENGTH_SHORT).show()
        }
        Accesorio.setOnClickListener(){
            val ventanaAccesorio = Intent(applicationContext, ProductsLineActivity::class.java)
            startActivity(ventanaAccesorio)
            Toast.makeText(applicationContext, "Accesorio Pulsado", Toast.LENGTH_SHORT).show()
        }
        Kit.setOnClickListener(){
            val ventanaKit = Intent(applicationContext, ProductsLineActivity::class.java)
            startActivity(ventanaKit)
            Toast.makeText(applicationContext, "Kit Pulsado", Toast.LENGTH_SHORT).show()
        }
        Galon.setOnClickListener(){
            val ventanaGalon = Intent(applicationContext, ProductsLineActivity::class.java)
            startActivity(ventanaGalon)
            Toast.makeText(applicationContext, "Galon Pulsado", Toast.LENGTH_SHORT).show()
        }
        Win.setOnClickListener(){
            val ventanaWin = Intent(applicationContext, ProductsLineActivity::class.java)
            startActivity(ventanaWin)
            Toast.makeText(applicationContext, "Win Pulsado", Toast.LENGTH_SHORT).show()
        }
        Guante.setOnClickListener(){
            val ventanaGuante = Intent(applicationContext, ProductsLineActivity::class.java)
            startActivity(ventanaGuante)
            Toast.makeText(applicationContext, "Guante Pulsado", Toast.LENGTH_SHORT).show()
        }
        Nivel.setOnClickListener(){
            val ventanaNivel = Intent(applicationContext, ProductsLineActivity::class.java)
            startActivity(ventanaNivel)
            Toast.makeText(applicationContext, "Nivel Pulsado", Toast.LENGTH_SHORT).show()
        }
    }
}