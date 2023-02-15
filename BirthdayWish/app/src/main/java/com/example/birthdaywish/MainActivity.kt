package com.example.birthdaywish

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdayCard(view: View) {
//        val name = nameInput.editableText.toString()
        Toast.makeText(this, "Happy Birthday Ankit Sharma", Toast.LENGTH_LONG).show()

        val intent = Intent(this, BirthdayWish::class.java)
        intent.putExtra(BirthdayWish.NAME_EXTRA, "Ankit Sharma")
        startActivity(intent)
    }
}