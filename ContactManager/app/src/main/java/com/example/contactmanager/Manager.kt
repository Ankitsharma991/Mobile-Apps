package com.example.contactmanager


import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Manager : AppCompatActivity() {
    // Create a variable of type Dialog
    lateinit var dialog: Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manager)

        var myButton = findViewById<Button>(R.id.btnClick)

        dialog = Dialog(this)
        dialog.setContentView(R.layout.alert_box)
//        dialog.window?.setBackgroundDrawable(getDrawable(drawable.alert_box))

        // Creating Button for the custom_dialog.xml design
        var buttonGood = dialog.findViewById<Button>(R.id.Good)
        var buttonFeedback = dialog.findViewById<Button>(R.id.Feedback)

        buttonGood.setOnClickListener {
            dialog.dismiss()
        }

        buttonFeedback.setOnClickListener {
//            dialog.dismiss()
            Toast.makeText(this, "Managers Details", Toast.LENGTH_SHORT).show()
            var intent = Intent(this, Details::class.java)
            startActivity(intent);


        }

        myButton.setOnClickListener {
            dialog.show()
        }
    }
}