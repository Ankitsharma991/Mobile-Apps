package com.example.listproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class UserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        val name = intent.getStringExtra("name")
        val phone = intent.getStringExtra("phone")
        val image = intent.getIntExtra("imageId", R.drawable.img1)

        val imageId = findViewById<ImageView>(R.id.profile_image)
        val uName = findViewById<TextView>(R.id.userName)
        val uPhone = findViewById<TextView>(R.id.phnNumber)

        uName.text = "Name : $name"
        uPhone.text = "Contact Number : $phone"
        imageId.setImageResource(image)
    }
}