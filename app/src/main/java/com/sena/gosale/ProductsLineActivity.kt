package com.sena.gosale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class ProductsLineActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products_line)

       /* val imagenBrocha1 = findViewById<ImageView>(R.id.imagenBrocha1)
        val imagenBrocha2 = findViewById<ImageView>(R.id.imagenBrocha2)

        imagenBrocha1.setOnClickListener{
            val ventanaFilaBrocha1 = Intent(this, productsAnatomyActivity::class.java)
            startActivity(ventanaFilaBrocha1)

            Toast.makeText(applicationContext, "Brocha 1", Toast.LENGTH_SHORT).show()
        }
        imagenBrocha2.setOnClickListener{
            val ventanaFilaBrocha2 = Intent(this, productsAnatomyActivity::class.java)
            startActivity(ventanaFilaBrocha2)

            Toast.makeText(applicationContext, "Brocha 2", Toast.LENGTH_SHORT).show()
        }   */
    }
}