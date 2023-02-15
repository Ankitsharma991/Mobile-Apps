package com.example.miniproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class WebDevelopment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_development)

        val htmlBtn = findViewById<ImageView>(R.id.htmlWeb)
        val cssBtn = findViewById<ImageView>(R.id.css)
        val jsBtn = findViewById<ImageView>(R.id.js)
        val reactBtn = findViewById<ImageView>(R.id.react)
        val nodeBtn = findViewById<ImageView>(R.id.node)
        val mongoBtn = findViewById<ImageView>(R.id.mongo)


        htmlBtn.setOnClickListener{
            intent = Intent(applicationContext, LearnHtml::class.java)
            startActivity(intent)

            Toast.makeText(applicationContext, "Learn HTML", Toast.LENGTH_SHORT).show()
        }

        cssBtn.setOnClickListener{
            intent = Intent(applicationContext, LearnCss::class.java)
            startActivity(intent)

            Toast.makeText(applicationContext, "Learn CSS", Toast.LENGTH_SHORT).show()
        }

        jsBtn.setOnClickListener{
            intent = Intent(applicationContext, LearnJs::class.java)
            startActivity(intent)

            Toast.makeText(applicationContext, "Learn Javascript", Toast.LENGTH_SHORT).show()
        }

        reactBtn.setOnClickListener{
            intent = Intent(applicationContext, LearnReact::class.java)
            startActivity(intent)

            Toast.makeText(applicationContext, "Learn ReactJs", Toast.LENGTH_SHORT).show()
        }

        nodeBtn.setOnClickListener{
            intent = Intent(applicationContext, LearnNode::class.java)
            startActivity(intent)

            Toast.makeText(applicationContext, "Learn NodeJs", Toast.LENGTH_SHORT).show()
        }

        mongoBtn.setOnClickListener{
            intent = Intent(applicationContext, LearnMongo::class.java)
            startActivity(intent)

            Toast.makeText(applicationContext, "Learn MongoDB", Toast.LENGTH_SHORT).show()
        }
    }
}