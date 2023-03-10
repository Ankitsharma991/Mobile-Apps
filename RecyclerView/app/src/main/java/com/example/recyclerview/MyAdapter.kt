package com.example.recyclerview

import android.app.Activity
import android.content.Intent
import android.telecom.Call.Details
import com.example.recyclerview.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter(private val newsArrayList: ArrayList<News>, private val context: Activity) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    /*
        // Code for recyclerview item click by Saumya dd

        private lateinit var myListener : onItemClickListener

        interface onItemClickListener {
            fun onItemClicking(position: Int)
        }

        fun setItemClickListener(listener : onItemClickListener){
            myListener = listener
        }

    */

    // to create new view instance
    // when layout manager fails to find suitable view for each time
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder { // if layout manager fails to create view, LM asks for help to this in order to create view and this method LM with the help of view holder
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.row_view, parent, false)
        return MyViewHolder(itemView/*, myListener*/)
    }

    // populate items with data
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {    // to populate data in view
        var currentitem = newsArrayList[position]
        holder.hTitle.text = currentitem.newsHeading
        holder.hImage.setImageResource(currentitem.newsImage)

        holder.itemView.setOnClickListener{
            val intent = Intent(context, NewsDetails::class.java)
            intent.putExtra("image", currentitem.newsImage)
            intent.putExtra("title", currentitem.newsHeading)
            intent.putExtra("paragraph", currentitem.newsParagraph)
            context.startActivity(intent)
        }
    }

    //  how many list items are present in your array
    override fun getItemCount(): Int {  // number of items
        return newsArrayList.size

    }

    // it holds the view so views are not created everytime, so memory can be saved
    class MyViewHolder(itemView: View /*, listener : onItemClickListener*/) : RecyclerView.ViewHolder(itemView) { // keeps holding extra view
            val hTitle = itemView.findViewById<TextView>(R.id.headingTitle)
            val hImage = itemView.findViewById<ShapeableImageView>(R.id.headingImage)

        /*
            init {
                itemView.setOnClickListener{
                    listener.onItemClicking(adapterPosition)
                }
            }
         */


        }

    }
//
//private fun Intent.putExtra(viewType: Int: String, currentitem: News) {
//
//}

