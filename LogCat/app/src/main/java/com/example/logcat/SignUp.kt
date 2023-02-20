package com.example.logcat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlin.math.sign

class SignUp : AppCompatActivity() {
    lateinit var database : DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val signButton = findViewById<Button>(R.id.registerBtn)
        val yourName = findViewById<TextInputEditText>(R.id.yourName)
        val userName = findViewById<TextInputEditText>(R.id.username)
        val userEmail = findViewById<TextInputEditText>(R.id.userEmail)
        val userPassword = findViewById<TextInputEditText>(R.id.userPassword)

        signButton.setOnClickListener{
            val name = yourName.text.toString()
            val userid = userName.text.toString()
            val email = userEmail.text.toString()
            val password = userPassword.text.toString()

            val user = User(name, userid, email, password)
            database = FirebaseDatabase.getInstance().getReference("Users")
            database.child(userid).setValue(user).addOnSuccessListener {
                Toast.makeText(this, "User Registered", Toast.LENGTH_SHORT).show()
            }.addOnSuccessListener {
                Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show()
            }
        }
    }
}