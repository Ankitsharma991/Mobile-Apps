package com.example.miniproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class IosDevelopment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ios_development)

        val flutterBtn = findViewById<ImageView>(R.id.flutter)
        val nativeBtn = findViewById<ImageView>(R.id.reactNative)
        val jsBtn = findViewById<ImageView>(R.id.js)
        val objCBtn = findViewById<ImageView>(R.id.objC)
        val cSharpBtn = findViewById<ImageView>(R.id.cSharp)
        val swiftBtn = findViewById<ImageView>(R.id.swift)



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

        jsBtn.setOnClickListener{
            intent = Intent(applicationContext, LearnJs::class.java)
            startActivity(intent)

            Toast.makeText(applicationContext, "Learn Javascript", Toast.LENGTH_SHORT).show()
        }

        objCBtn.setOnClickListener{
            intent = Intent(applicationContext, LearnObjC::class.java)
            startActivity(intent)

            Toast.makeText(applicationContext, "Learn Obj-C", Toast.LENGTH_SHORT).show()
        }

        cSharpBtn.setOnClickListener{
            intent = Intent(applicationContext, LearnCsharp::class.java)
            startActivity(intent)

            Toast.makeText(applicationContext, "Learn C#", Toast.LENGTH_SHORT).show()
        }

        swiftBtn.setOnClickListener{
            intent = Intent(applicationContext, LearnSwift::class.java)
            startActivity(intent)

            Toast.makeText(applicationContext, "Learn Swift", Toast.LENGTH_SHORT).show()
        }
    }
}