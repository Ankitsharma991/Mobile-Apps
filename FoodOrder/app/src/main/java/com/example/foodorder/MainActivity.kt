package com.example.foodorder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // creating key
    companion object {
        const val KEY = "com.example.foodorder.MainActivity.KEY"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val orderBtn = findViewById<TextView>(R.id.order)
        val menuBtn = findViewById<TextView>(R.id.menu)


        orderBtn.setOnClickListener{
            val message = "Your orders are"+"\n"+"\t"+text1.text.toString()+"\n"+"\t"+text2.text.toString()+"\n"+"\t"+text3.text.toString()+"\n"+"\t"+text4.text.toString()+"\n"
            intent = Intent( this, OrderConfirmed::class.java)
            intent.putExtra(KEY, message)
            startActivity(intent)
            Toast.makeText(applicationContext, "Confirming Order", Toast.LENGTH_SHORT).show()

        }

        menuBtn.setOnClickListener {
            intent = Intent(applicationContext, Menu::class.java)
            startActivity(intent)
            Toast.makeText(applicationContext, "Loading Menu", Toast.LENGTH_SHORT).show()
        }
    }
}