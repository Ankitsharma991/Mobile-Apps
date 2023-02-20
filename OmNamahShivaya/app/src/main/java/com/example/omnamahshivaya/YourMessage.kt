package com.example.omnamahshivaya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class YourMessage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_your_message)

        val btn = findViewById<Button>(R.id.harhar)
        val name = findViewById<TextView>(R.id.name)
        btn.setOnClickListener{
            Toast.makeText(applicationContext, "Have a Good Day", Toast.LENGTH_SHORT).show()
            var intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }
        val userName = intent.getStringExtra(Message.KEY)
        name.text = userName.toString()
    }
}