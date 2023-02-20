package com.example.database

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val signButton = findViewById<Button>(R.id.registerBtn)
        val yourName = findViewById<TextInputEditText>(R.id.yourName)
        val userName = findViewById<TextInputEditText>(R.id.username)
        val userEmail = findViewById<TextInputEditText>(R.id.userEmail)
        val userPassword = findViewById<TextInputEditText>(R.id.userPassword)

        signButton.setOnClickListener {
            val name = yourName.text.toString()
            val userid = userName.text.toString()
            val email = userEmail.text.toString()
            val password = userPassword.text.toString()
        }
    }
}