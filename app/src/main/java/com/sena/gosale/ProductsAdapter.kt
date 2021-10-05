package com.sena.gosale

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ProductsAdapter (private val images: List<String>):RecyclerView.Adapter<ProductsViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductsViewHolder{
        val layoutInflater = LayoutInflater.from(parent.context)
        return ProductsViewHolder(layoutInflater.inflate(R.layout.item_products, parent, false))
    }

    override fun onBindViewHolder(holder: ProductsViewHolder, position: Int) {
        val item = images[position]
        holder.bind(item)
    }

    //Nos muestra la cantidad de imagenes que le especifiquemos
    override fun getItemCount(): Int = images.size

}