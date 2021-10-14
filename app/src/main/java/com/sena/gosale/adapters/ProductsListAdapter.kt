package com.sena.gosale.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.sena.gosale.R
import com.sena.gosale.base.BaseViewHolder
import com.sena.gosale.modelo.productos
import kotlinx.android.synthetic.main.item_products.view.*
import kotlinx.android.synthetic.main.item_products_lista.view.*

class ProductsListAdapter(
    private val context:                           Context,
    private val ListProducts:              List<productos>,
    private val itemClickListener: OnProductoListClickListener,
): RecyclerView.Adapter<BaseViewHolder<*>>() {

    interface OnProductoListClickListener {
        fun onItemClick(nombre: String)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<*> {
        return ProductsListViewHolder(LayoutInflater.from(context).inflate(R.layout.item_products_lista, parent, false))
    }

    override fun onBindViewHolder(holder: BaseViewHolder<*>, position: Int) {
        when (holder) {
            is ProductsListViewHolder -> holder.bind(ListProducts[position], position)
            else -> throw IllegalAccessException("Se olvido pasar el viewhodel en el bind")
        }
    }

    override fun getItemCount(): Int = ListProducts.size

    inner class ProductsListViewHolder(itemView: View) : BaseViewHolder<productos>(itemView) {
        override fun bind(item: productos, position: Int) {
            itemView.setOnClickListener { itemClickListener.onItemClick(item.nombre) }
            Glide.with(context).load(item.image).into(itemView.imgproducts)
            itemView.txtNombProducto.text = item.nombre
            itemView.txtNombAncho.text = item.ancho
            itemView.txtNombLargo.text = item.largo
            itemView.txtNombLCerda.text = item.lcerda
            itemView.txtNombEspesor.text = item.espesor
            itemView.txtNombColor.text = item.color

        }

    }
}