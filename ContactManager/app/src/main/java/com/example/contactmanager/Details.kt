package com.example.contactmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val name = intent.getStringExtra(Manager.KEY1)
        val phone = intent.getStringExtra(Manager.KEY2)
        val address = intent.getStringExtra(Manager.KEY3)

        var textY = findViewById<TextView>(R.id.text)
        textY.text = "Your Manager's name is "+name+" whose contact number is "+phone+" and address details is "+address
    }
}