package com.example.explictintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnIntent = findViewById<Button>(R.id.button2)
        btnIntent.setOnClickListener{
            // open a new activity
            intent = Intent(applicationContext, ExplictIntented::class.java)
            startActivity(intent)
        }
    }
}