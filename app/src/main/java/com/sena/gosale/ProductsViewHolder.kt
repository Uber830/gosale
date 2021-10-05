package com.sena.gosale

import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.sena.gosale.databinding.ItemProductsBinding
import com.squareup.picasso.Picasso

class ProductsViewHolder(val view: View): RecyclerView.ViewHolder(view) {

    private val bindingProd = ItemProductsBinding.bind(view)

    //--- Se llama por cada selda que vallamos a mostrar
    fun bind(image:String){
        Picasso.get().load(image).into(bindingProd.ivProducts)
        view.setOnClickListener{

            Toast.makeText(view.context, "Mascota!", Toast.LENGTH_SHORT).show()
        }
    }
}