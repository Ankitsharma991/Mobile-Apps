package com.example.globalguru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class GgHome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gg_home)

        val asia = findViewById<TextView>(R.id.asia)
        val  africa = findViewById<TextView>(R.id.africa)
        val europe = findViewById<TextView>(R.id.europe)
        val northAmerica = findViewById<TextView>(R.id.northAmerica)
        val southAmerica = findViewById<TextView>(R.id.southAmerica)
        val australasia = findViewById<TextView>(R.id.australasia)


        asia.setOnClickListener{
            val intent = Intent(this, AvailableLocations::class.java)
            intent.putExtra("extra", "Asia")
            startActivity(intent)
        }

        africa.setOnClickListener{
            val intent = Intent(this, AvailableLocations::class.java)
            intent.putExtra("extra", "Africa")
            startActivity(intent)
        }

        europe.setOnClickListener{
            val intent = Intent(this, AvailableLocations::class.java)
            intent.putExtra("extra", "Europe")
            startActivity(intent)
        }

        australasia.setOnClickListener{
            val intent = Intent(this, AvailableLocations::class.java)
            intent.putExtra("extra", "Australasia")
            startActivity(intent)
        }

        northAmerica.setOnClickListener{
            val intent = Intent(this, AvailableLocations::class.java)
            intent.putExtra("extra", "North America")
            startActivity(intent)
        }

        southAmerica.setOnClickListener{
            val intent = Intent(this, AvailableLocations::class.java)
            intent.putExtra("extra", "South America")
            startActivity(intent)
        }

    }
}