package com.example.customdialogbox

import android.app.Dialog
import android.os.BaseBundle
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.customdialogbox.R.drawable

class MainActivity : AppCompatActivity() {
    // Create a variable of type Dialog
    lateinit var dialog: Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myButton = findViewById<Button>(R.id.btnClick)

        dialog = Dialog(this)
        dialog.setContentView(R.layout.custom_dialog)
        dialog.window?.setBackgroundDrawable(getDrawable(drawable.bg_custon_alert_box))

        // Creating Button for the custom_dialog.xml design
        var buttonGood = dialog.findViewById<Button>(R.id.Good)
        var buttonFeedback = dialog.findViewById<Button>(R.id.Feedback)

        buttonGood.setOnClickListener {
            dialog.dismiss()
        }

        buttonFeedback.setOnClickListener {
            Toast.makeText(this, "Unavailable now", Toast.LENGTH_SHORT).show()
            dialog.dismiss()
        }

        myButton.setOnClickListener {
            dialog.show()
        }
    }
}