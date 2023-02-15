package com.example.foodorder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.marginLeft
import kotlinx.android.synthetic.main.activity_order_confirmed.*

class OrderConfirmed : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_confirmed)

        val customerOrder = intent.getStringExtra(MainActivity.KEY)
        showOrder.text = customerOrder.toString()

        val confirmBtn = findViewById<TextView>(R.id.confirm)
        confirmBtn.setOnClickListener{
            if(showOrder.text=="Your Order is Confirmed\n" +
                "Much appreciated, \n" +
                "Thank you!!!"){
                Toast.makeText(applicationContext, "Loading Homepage", Toast.LENGTH_SHORT).show()
                intent = Intent(applicationContext, MainActivity::class.java)
                startActivity(intent)
            }
            else{
                confirmBtn.text = "Home"
                Toast.makeText(applicationContext, "Order Confirmed", Toast.LENGTH_SHORT).show()
                showOrder.text = "Your Order is Confirmed\nMuch appreciated, \nThank you!!!"
            }
        }
    }
}