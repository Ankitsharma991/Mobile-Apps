package com.example.miniproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class AndroidDevelopment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_development)

        val flutterBtn = findViewById<ImageView>(R.id.flutter)
        val nativeBtn = findViewById<ImageView>(R.id.reactNative)
        val javaBtn = findViewById<ImageView>(R.id.java)
        val androidBtn = findViewById<ImageView>(R.id.android)
        val kotlinBtn = findViewById<ImageView>(R.id.kotlin)
        val firebaseBtn = findViewById<ImageView>(R.id.firebase)



        flutterBtn.setOnClickListener{
            intent = Intent(applicationContext, LearnFlutter::class.java)
            startActivity(intent)

            Toast.makeText(applicationContext, "Learn Flutter", Toast.LENGTH_SHORT).show()
        }

        nativeBtn.setOnClickListener{
            intent = Intent(applicationContext, LearnNative::class.java)
            startActivity(intent)

            Toast.makeText(applicationContext, "Learn React-Native", Toast.LENGTH_SHORT).show()
        }

        javaBtn.setOnClickListener{
            intent = Intent(applicationContext, LearnJava::class.java)
            startActivity(intent)

            Toast.makeText(applicationContext, "Learn Java", Toast.LENGTH_SHORT).show()
        }

        kotlinBtn.setOnClickListener{
            intent = Intent(applicationContext, LearnKotlin::class.java)
            startActivity(intent)

            Toast.makeText(applicationContext, "Learn Kotlin", Toast.LENGTH_SHORT).show()
        }

        androidBtn.setOnClickListener{
            intent = Intent(applicationContext, LearnAndroid::class.java)
            startActivity(intent)

            Toast.makeText(applicationContext, "Learn Android-Studio", Toast.LENGTH_SHORT).show()
        }

        firebaseBtn.setOnClickListener{
            intent = Intent(applicationContext, LearnFirebase::class.java)
            startActivity(intent)

            Toast.makeText(applicationContext, "Learn FireBase", Toast.LENGTH_SHORT).show()
        }
    }
}