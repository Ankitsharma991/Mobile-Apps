package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class NewsDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_details)

        val imgId = findViewById<ImageView>(R.id.image)
        val nTitle = findViewById<TextView>(R.id.title)
        val nPara = findViewById<TextView>(R.id.paragraph)

        val image = intent.getIntExtra("image", R.drawable.pic0)
        val heading = intent.getStringExtra("title")
        val statements = intent.getStringExtra("paragraph")

        nTitle.text = heading
        nPara.text = statements
        imgId.setImageResource(image)
    }
}