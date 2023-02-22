package com.example.viewbinding

import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            if(binding.checkBox2.isChecked){

                // open new screen
                Toast.makeText(this, "Mission Successful", Toast.LENGTH_SHORT).show()
                var intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
            else{
                binding.checkBox2.buttonTintList = ColorStateList.valueOf(Color.RED)
                Toast.makeText(this, "Accept conditions", Toast.LENGTH_SHORT).show()
            }
        }
    }
}