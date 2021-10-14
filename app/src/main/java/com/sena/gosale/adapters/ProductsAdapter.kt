package com.sena.gosale.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.sena.gosale.R
import com.sena.gosale.base.BaseViewHolder
import com.sena.gosale.datasource.DataSourceProducts.ListProducts
import com.sena.gosale.modelo.productos
import kotlinx.android.synthetic.main.item_products.view.*

class ProductsAdapter(
    private val context:                         Context,
    private val ListProducts:             List<productos>,
    private val itemClickListener: OnProductoClickListener,
): RecyclerView.Adapter<BaseViewHolder<*>>(){

    interface OnProductoClickListener {
        fun onItemClick(nombre: String)
        fun onImageClik(image: String)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<*> {
        return ProductsViewHolder(LayoutInflater.from(context).inflate(R.layout.item_products, parent, false))
    }

    override fun onBindViewHolder(holder: BaseViewHolder<*>, position: Int) {
        when(holder){
            is ProductsViewHolder -> holder.bind(ListProducts[position],position)
            else -> throw IllegalAccessException("Se olvido pasar el ViewHodel en bind")
        }
    }

    override fun getItemCount(): Int = ListProducts.size

    inner class ProductsViewHolder(itemView: View): BaseViewHolder<productos>(itemView){
        override fun bind(item: productos, position: Int) {
            itemView.setOnClickListener{ itemClickListener.onItemClick(item.nombre) }
            itemView.imgProducts.setOnClickListener{ itemClickListener.onImageClik(item.image) }
            Glide.with(context).load(item.image).into(itemView.imgProducts)
            itemView.txtNombProducto.text = item.nombre
        }
    }
}