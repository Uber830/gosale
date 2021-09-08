package com.sena.gosale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class ProductoActivity : AppCompatActivity() {
    //variables de entrada
    val image_brocha = findViewById<ImageView>(R.id.image)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_producto)

        clickVistaBrochas()
    }

    fun clickVistaBrochas(){
        image_brocha.setOnClickListener(){
            val venatanaBrocha = Intent(applicationContext, ProductsLineActivity::class.java)
            Toast.makeText(applicationContext, "Brocha Pulsada", Toast.LENGTH_SHORT).show()
        }
    }

}