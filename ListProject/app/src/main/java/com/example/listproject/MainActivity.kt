package com.example.listproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    lateinit var userArrayList : ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = arrayOf("Ankit Sharma", "Saumya Singh", "Prastuti", "Pradeep Singh", "Aman Negi")
        val lastMsg = arrayOf("Stay curious", "Keep going", "Choose kindness", "Embrace change", "Make it happen")
        val lastMsgTime = arrayOf("3:15 PM", "9:45 AM", "7:30 PM", "11:00 AM", "8:20 PM")
        val phoneNumber = arrayOf("8797811729", "9834629183", "8888362271", "9607776321", "9045834832")
        val imgId = arrayOf(R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5)

        userArrayList = ArrayList()
        for (eachIndex in name.indices){
            val user = User(name[eachIndex], lastMsg[eachIndex], lastMsgTime[eachIndex],
                phoneNumber[eachIndex], imgId[eachIndex])
            userArrayList.add(user)
        }

        val listView = findViewById<ListView>(R.id.listView)
        listView.isClickable = true
        listView.adapter = MyAdapter(this, userArrayList)

        listView.setOnItemClickListener{ parent, view, position, id->
            // open a new a activity
            val userName = name[position]
            val userPhone = phoneNumber[position]
            val imgId = imgId[position]

            val intent = Intent(this, UserActivity::class.java)
            intent.putExtra("name", userName)
            intent.putExtra("phone", userPhone)
            intent.putExtra("imageId", imgId)
            startActivity(intent)
        }
    }
}
