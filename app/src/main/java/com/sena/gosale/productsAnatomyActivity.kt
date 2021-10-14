package com.sena.gosale

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.sena.gosale.databinding.ActivityProductsAnatomyBinding

class productsAnatomyActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProductsAnatomyBinding

    var images = intArrayOf(
        R.drawable.brocha1,
        R.drawable.brocha2,
        R.drawable.brocha3,
    )

    var nombrs = arrayOf(
        "Precisión",
        "Diseño",
        "Comodidad"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductsAnatomyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.carousel.pageCount = nombrs.size

        binding.carousel.setImageListener { position, imageView ->
            imageView.setImageResource(images[position])
        }

        binding.carousel.setImageClickListener{ position ->
            Toast.makeText(this, nombrs[position], Toast.LENGTH_SHORT).show()
        }
    }
}