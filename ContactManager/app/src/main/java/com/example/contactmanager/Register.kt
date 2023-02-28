package com.example.contactmanager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class Register : AppCompatActivity() {

    lateinit var database : DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val signButton = findViewById<Button>(R.id.signButton)
        val etName = findViewById<TextInputEditText>(R.id.etName)
        val etEmail = findViewById<TextInputEditText>(R.id.etMail)
        val userPassword = findViewById<TextInputEditText>(R.id.etpassword)
        val userId = findViewById<TextInputEditText>(R.id.etUsername)

        signButton.setOnClickListener {
            val name = etName.text.toString()
            val mail = etEmail.text.toString()
            val uniqueId = userId.text.toString()
            val password = userPassword.text.toString()

            val user = User(name, mail, uniqueId, password)

            if (name == "" || mail == "" || uniqueId == "" || password == "") {
                Toast.makeText(this, "Value Missing", Toast.LENGTH_SHORT).show()
            } else {
                database = FirebaseDatabase.getInstance().getReference("Users")
                database.child(uniqueId).setValue(user).addOnSuccessListener {
                    Toast.makeText(this, "User Registered", Toast.LENGTH_SHORT).show()
                    etName.setText("")
                    etEmail.setText("")
                    userPassword.setText("")
                    userId.setText("")
                }.addOnCanceledListener {
                    Toast.makeText(this, "Registration Failed", Toast.LENGTH_SHORT).show()
                }
            }
        }
        val signIn = findViewById<Button>(R.id.LoginButton)
        signIn.setOnClickListener {
            val intent = Intent(applicationContext, SignIn::class.java)
            startActivity(intent)
        }
    }
}