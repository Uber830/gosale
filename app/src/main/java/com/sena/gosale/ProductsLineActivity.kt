package com.sena.gosale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.ConcatAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.sena.gosale.adapters.ProductsListAdapter
import com.sena.gosale.databinding.ActivityProductsLineBinding
import com.sena.gosale.datasource.DataSourceProducts
import kotlinx.android.synthetic.main.activity_products_line.*

class ProductsLineActivity : AppCompatActivity(),ProductsListAdapter.OnProductoListClickListener{

    private lateinit var binding: ActivityProductsLineBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductsLineBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.RecyClerViewLis.layoutManager = LinearLayoutManager(this)
        val productslistadapter = ProductsListAdapter(this, DataSourceProducts.ListProducts, this)
        val mergeadapter = ConcatAdapter(productslistadapter)
        RecyClerViewLis.adapter = mergeadapter
    }

    override fun onItemClick(nombre: String) {
        val intent = Intent(this, productsAnatomyActivity::class.java)
        startActivity(intent)

        Toast.makeText(this, "Enviando!", Toast.LENGTH_SHORT).show()
    }

}