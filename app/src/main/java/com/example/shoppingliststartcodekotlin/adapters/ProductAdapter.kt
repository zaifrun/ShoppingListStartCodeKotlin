package com.example.shoppingliststartcodekotlin.adapters

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.shoppingliststartcodekotlin.data.Product


class ProductAdapter(var products: MutableList<Product>) :
    RecyclerView.Adapter<ProductAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductAdapter.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ProductAdapter.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }
}
