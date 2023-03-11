package com.example.globalguru

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ExploreDest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explore_dest)

        var imgId = findViewById<ImageView>(R.id.image)
        var location = findViewById<TextView>(R.id.location)
        var summary = findViewById<TextView>(R.id.paragraph)

        var img = intent.getIntExtra("image", R.drawable.africa1)
        imgId.setImageResource(img)

        var local = intent.getStringExtra("location")
        var cntry = intent.getStringExtra("country")

        location.text = "\uD83D\uDCCD $local, $cntry"
        summary.text = intent.getStringExtra("details")
    }
}