package com.example.implicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webButton = findViewById<CardView>(R.id.cardWeb)
        val camButton = findViewById<CardView>(R.id.cardCam)

        webButton.setOnClickListener{
         val intent = Intent(Intent.ACTION_VIEW)
         intent.data = Uri.parse("https://www.linkedin.com/in/ankit-sharma-361467208/")
            startActivity(intent)
        }

        camButton.setOnClickListener{
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }
    }
}