package com.example.omnamahshivaya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView

class Card : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card)

        val message = findViewById<CardView>(R.id.messageC)
        val history = findViewById<CardView>(R.id.historyC)

        message.setOnClickListener{
            Toast.makeText(applicationContext, "Loading Message", Toast.LENGTH_SHORT).show()
            val intent = Intent(applicationContext, Message::class.java)
            startActivity(intent)
        }

        history.setOnClickListener{
            Toast.makeText(applicationContext, "MahaShivratri History", Toast.LENGTH_SHORT).show()
            val intent = Intent(applicationContext, History::class.java)
            startActivity(intent)
        }

        val m = "\uD83D\uDD31"
        val u = "Dear Ankit,\n" +
                "\n" +
                "Wishing you and your family a happy and blessed Mahashivratri! May Lord Shiva's grace be with you always, and may this auspicious occasion bring you peace, prosperity, and happiness.\n" +
                "\n" +
                "Jai Bholenath!!!"
    }
}