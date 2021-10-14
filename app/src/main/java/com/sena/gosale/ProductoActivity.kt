package com.sena.gosale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.ConcatAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.load.DataSource
import com.sena.gosale.adapters.ProductsAdapter
import com.sena.gosale.databinding.ActivityProductoBinding
import com.sena.gosale.datasource.DataSourceProducts
import kotlinx.android.synthetic.main.activity_producto.*

class ProductoActivity : AppCompatActivity(), ProductsAdapter.OnProductoClickListener{

    private lateinit var binding: ActivityProductoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductoBinding.inflate(layoutInflater)
        setContentView(binding.root)

            binding.recyclerView.layoutManager = LinearLayoutManager(this)

        val productsAdapter = ProductsAdapter(this,DataSourceProducts.ListProducts, this)
        val mergeAdapter = ConcatAdapter(productsAdapter)
        recyclerView.adapter = mergeAdapter
    }

    override fun onItemClick(nombre: String) {
        Toast.makeText(this, "Estas en $nombre!", Toast.LENGTH_SHORT).show()
    }

    override fun onImageClik(image: String) {
        val intent = Intent(this, productsAnatomyActivity::class.java)
        startActivity(intent)

        Toast.makeText(this, "Enviando!", Toast.LENGTH_SHORT).show()
    }

}