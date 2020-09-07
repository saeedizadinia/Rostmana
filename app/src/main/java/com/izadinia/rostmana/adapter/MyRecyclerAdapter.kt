package com.izadinia.rostmana.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.izadinia.rostmana.R
import com.izadinia.rostmana.model.CategoryDrawablesModel


class MyRecyclerAdapter(models: ArrayList<CategoryDrawablesModel>) : RecyclerView.Adapter<MyRecyclerAdapter.MyViewHolder>() {
    private var catModels: ArrayList<CategoryDrawablesModel> = models

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).
        inflate(R.layout.category_item, parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val catModel: CategoryDrawablesModel = catModels[position]
        holder.catImage.setImageResource(catModel.imageId)
        holder.itemView.setOnClickListener {  }
    }

    override fun getItemCount(): Int {
        return catModels.size
    }

    class MyViewHolder(eachItem: View) : RecyclerView.ViewHolder(eachItem) {
        var catImage: ImageView = eachItem.findViewById(R.id.category_image)
    }
}