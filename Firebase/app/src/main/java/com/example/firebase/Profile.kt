package com.example.firebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)


        val email = intent.getStringExtra(SignIn.KEY1)
        val name = intent.getStringExtra(SignIn.KEY2)
        val password = intent.getStringExtra(SignIn.KEY3)
        val unique = intent.getStringExtra(SignIn.KEY4)


        val profile = findViewById<TextView>(R.id.details)
        profile.text = "Hey $unique ,\nYour name is $name , Your email is $email  and password is $password \nThank You!!!\n"


        val home = findViewById<Button>(R.id.homeBtn)
        home.setOnClickListener{
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }
    }
}