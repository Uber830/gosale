package com.sena.gosale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ProductsLineActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products_line)

        val imageBrocha = findViewById<ImageView>(R.id.imagenBrocha)

        imageBrocha.setOnClickListener{
            val ventanaBrocha = Intent(this, productsAnatomyActivity::class.java)
            startActivity(ventanaBrocha)
        }
    }
}