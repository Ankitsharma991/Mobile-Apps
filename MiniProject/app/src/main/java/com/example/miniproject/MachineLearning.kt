package com.example.miniproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MachineLearning : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_machine_learning)

        val matLabBtn = findViewById<ImageView>(R.id.mtLab)
        val pyBtn = findViewById<ImageView>(R.id.python)
        val pTBtn = findViewById<ImageView>(R.id.pTorch)
        val cLBtn = findViewById<ImageView>(R.id.coLab)
        val skLBtn = findViewById<ImageView>(R.id.skLearn)
        val tfBtn = findViewById<ImageView>(R.id.tFlow)



        pyBtn.setOnClickListener{
            intent = Intent(applicationContext, LearnPython::class.java)
            startActivity(intent)

            Toast.makeText(applicationContext, "Learn Python", Toast.LENGTH_SHORT).show()
        }

        pTBtn.setOnClickListener{
            intent = Intent(applicationContext, LearnPtTorch::class.java)
            startActivity(intent)

            Toast.makeText(applicationContext, "Learn pyTorch", Toast.LENGTH_SHORT).show()
        }

        cLBtn.setOnClickListener{
            intent = Intent(applicationContext, LearnColab::class.java)
            startActivity(intent)

            Toast.makeText(applicationContext, "Learn Colab", Toast.LENGTH_SHORT).show()
        }

        skLBtn.setOnClickListener{
            intent = Intent(applicationContext, LearnSkL::class.java)
            startActivity(intent)

            Toast.makeText(applicationContext, "Learn ScikitLearn", Toast.LENGTH_SHORT).show()
        }

        tfBtn.setOnClickListener{
            intent = Intent(applicationContext, LearnTf::class.java)
            startActivity(intent)

            Toast.makeText(applicationContext, "Learn TenserFlow", Toast.LENGTH_SHORT).show()
        }

        matLabBtn.setOnClickListener{
            intent = Intent(applicationContext, LearnMatlab::class.java)
            startActivity(intent)

            Toast.makeText(applicationContext, "Learn MATLAB", Toast.LENGTH_SHORT).show()
        }
    }
}