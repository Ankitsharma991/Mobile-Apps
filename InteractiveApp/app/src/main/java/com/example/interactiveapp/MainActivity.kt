package com.example.interactiveapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dark= findViewById<Button>(R.id.btnDark)
        val light = findViewById<Button>(R.id.btnLight)
        val layout = findViewById<LinearLayout>(R.id.LinearLayout)

        light.setOnClickListener{
            // change to light mode
            layout.setBackgroundColor(R.color.yellow)
        }

        dark.setOnClickListener{
            // change to light mode
            layout.setBackgroundColor(R.color.black)
        }

    }
}