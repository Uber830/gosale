package com.sena.gosale

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.sena.gosale.base.BaseViewHolder
import com.sena.gosale.modelo.productos
import kotlinx.android.synthetic.main.item_products.view.*

class RecyclerAdapater(
    private val context:                  Context,
    private val listadoProductos: List<productos>,
    private val itemClickListener: OnProductoClickListener,
    ):RecyclerView.Adapter<BaseViewHolder<*>>(){

    interface OnProductoClickListener {
        fun onItemClick(nombre: String)
        fun onImageClik(image: String)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<*> {
        return productosViewHolder(LayoutInflater.from(context).inflate(R.layout.item_products, parent, false))
    }

    override fun onBindViewHolder(holder: BaseViewHolder<*>, position: Int) {
        when(holder){
            is productosViewHolder -> holder.bind(listadoProductos[position],position)
            else -> throw IllegalAccessException("Se le olvido pasar el viewhodel en el bind")
        }
    }

    override fun getItemCount(): Int = listadoProductos.size

    inner class productosViewHolder(itemView: View):BaseViewHolder<productos>(itemView){
        override fun bind(item: productos, position: Int) {
            itemView.setOnClickListener{ itemClickListener.onItemClick(item.nombre) }
            itemView.imgProducts.setOnClickListener{ itemClickListener.onImageClik(item.image) }
            Glide.with(context).load(item.image).into(itemView.imgProducts)
            itemView.txtNombProducto.text = item.nombre

        }

    }
}