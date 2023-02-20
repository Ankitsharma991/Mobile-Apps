package com.example.omnamahshivaya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.google.android.material.textfield.TextInputEditText

class Message : AppCompatActivity() {
    companion object {
        const val KEY = "com.example.foodorder.MainActivity.KEY"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)

        val messageBtn = findViewById<Button>(R.id.HappyBtn)
        messageBtn.setOnClickListener{
            Toast.makeText(applicationContext, "Happy MahaShivratri", Toast.LENGTH_SHORT).show()
            var intent = Intent(applicationContext, YourMessage::class.java)
            startActivity(intent)

            val nameText = findViewById<TextInputEditText>(R.id.HappyMsg)
            val message = "Dear "+ nameText.text.toString()+","
            intent = Intent( this, YourMessage::class.java)
            intent.putExtra(Message.KEY, message)
            startActivity(intent)
        }

    }
}