package com.example.birthdaywish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class BirthdayWish : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_wish)

        val name = intent.getStringExtra(NAME_EXTRA);
//        birthdayGreeting.text = "Happy Birthday $name"
    }
}