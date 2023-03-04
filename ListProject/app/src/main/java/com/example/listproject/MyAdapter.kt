package com.example.listproject
import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView
import java.text.FieldPosition

data class MyAdapter(val context : Activity, private val arrayList: ArrayList<User>)
    : ArrayAdapter<User>(context, R.layout.list_template, arrayList){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.list_template, null)
        val image = view.findViewById<CircleImageView>(R.id.profile_image)
        val name = view.findViewById<TextView>(R.id.name)
        val lastMsg = view.findViewById<TextView>(R.id.lastMsg)
        val lastMsgTime = view.findViewById<TextView>(R.id.lastMsgTime)

        name.text = arrayList[position].name
        lastMsg.text = arrayList[position].lastMsg
        lastMsgTime.text = arrayList[position].lastMsgTime
        image.setImageResource(arrayList[position].imageId)
        return view
    }
}
