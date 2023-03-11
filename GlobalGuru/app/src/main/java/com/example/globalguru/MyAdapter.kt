package com.example.globalguru
import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import java.text.FieldPosition

class MyAdapter (private val travelsArrayList: ArrayList<Destination>, private val context : Activity):
    RecyclerView.Adapter<MyAdapter.MyViewHolder>(){

    override fun onCreateViewHolder(parent : ViewGroup, viewType : Int): MyAdapter.MyViewHolder{
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.dest_view, parent, false)
        return MyViewHolder(itemView)
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int){
        var currentDest = travelsArrayList[position]
        holder.title.text = currentDest.location
        holder.image.setImageResource(currentDest.Img)

        holder.itemView.setOnClickListener{
            val intent = Intent(context, ExploreDest::class.java)
            intent.putExtra("image", currentDest.Img)
            intent.putExtra("location", currentDest.location)
            intent.putExtra("country", currentDest.country)
            intent.putExtra("details", currentDest.detail)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return travelsArrayList.size
    }

    class MyViewHolder(itemView : View): RecyclerView.ViewHolder(itemView){
        val title : TextView = itemView.findViewById<TextView>(R.id.Title)
        val image : ShapeableImageView = itemView.findViewById<ShapeableImageView>(R.id.Image)
    }
}