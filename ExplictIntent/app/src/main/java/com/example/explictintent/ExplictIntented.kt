package com.example.explictintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ExplictIntented : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explict_intented)
        val tt = findViewById<TextView>(R.id.textView)
        tt.setOnClickListener{
            // open a new activity
            intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }
    }
}