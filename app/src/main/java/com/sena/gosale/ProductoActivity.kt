package com.sena.gosale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class ProductoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_producto)

        val brocha = findViewById<ImageView>(R.id.imageBrocha)

        brocha.setOnClickListener{
            val ventanaBrocha = Intent(this, ProductsLineActivity::class.java)
            startActivity(ventanaBrocha)
        }

    }
}