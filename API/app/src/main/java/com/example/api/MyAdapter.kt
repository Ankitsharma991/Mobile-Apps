package com.example.api

import android.annotation.SuppressLint
import android.app.Activity
import android.content.res.ColorStateList
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RatingBar
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.google.android.material.imageview.ShapeableImageView
import com.squareup.picasso.Picasso

class MyAdapter(val context : Activity, val productArrayList: List<Product>):
RecyclerView.Adapter<MyAdapter.MyViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.product_view, parent, false)
        return MyViewHolder(itemView)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = productArrayList[position]
        holder.product.text = currentItem.title
        // picasso is used to show images from url to image view
        Picasso.get().load(currentItem.thumbnail).into(holder.image)
        holder.price.text = "$"+ currentItem.price.toString()
        holder.ratingBar.rating = currentItem.rating.toFloat()


    }

    override fun getItemCount(): Int {
        return productArrayList.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var product : TextView
        var image : ShapeableImageView
        var price : TextView
        val ratingBar : RatingBar

        init {
            product = itemView.findViewById(R.id.Title)
            image = itemView.findViewById(R.id.Image)
            price = itemView.findViewById(R.id.price)
            ratingBar = itemView.findViewById(R.id.rr)
        }
    }
}