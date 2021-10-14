package com.sena.gosale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.sena.gosale.databinding.ActivityProductoBinding
import com.sena.gosale.modelo.productos
import kotlinx.android.synthetic.main.activity_producto.*

class ProductoActivity : AppCompatActivity(),RecyclerAdapater.OnProductoClickListener {

    private lateinit var producto: ActivityProductoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        producto = ActivityProductoBinding.inflate(layoutInflater)
        setContentView(producto.root)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        recyclerView.layoutManager = LinearLayoutManager(this)
      // <!--  recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL)) --> Nos divide el cardView
        val listadoProductos = listOf(
            productos("Brochas", "https://n9.cl/2166b"),
            productos("Rodillos", "https://n9.cl/olzty"),
            productos("Llanas", "https://n9.cl/ubgjb"),
            productos("Espatulas", "https://n9.cl/g9nxw"),
            productos("Accesorios", "https://n9.cl/i4bn24"),
            productos("Kit Goya", "https://n9.cl/jz9mj"),
            productos("Galones", "https://n9.cl/onyd1"),
            productos("Win y Esquincero", "https://n9.cl/wd5tl"),
            productos("niveles", "https://n9.cl/m3npd"),
            productos("Guantes", "https://n9.cl/lk6pm")
        )
        recyclerView.adapter = RecyclerAdapater(this,listadoProductos, this)
    }

    override fun onItemClick(nombre: String) {
        Toast.makeText(this,"Estates in $nombre", Toast.LENGTH_SHORT).show()
    }

    override fun onImageClik(image: String) {
        val intent = Intent(this, ProductsLineActivity::class.java)
        startActivity(intent)

        Toast.makeText(this, "Enviando!", Toast.LENGTH_SHORT).show()
    }
}