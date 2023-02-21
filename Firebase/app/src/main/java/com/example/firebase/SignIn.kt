package com.example.firebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class SignIn : AppCompatActivity() {
    lateinit var databaseReference : DatabaseReference

    companion object{
        const val KEY1 = "com.example.firebase.SignIn.KEY1"
        const val KEY2 = "com.example.firebase.SignIn.KEY2"
        const val KEY3 = "com.example.firebase.SignIn.KEY3"
        const val KEY4 = "com.example.firebase.SignIn.KEY4"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val userName = findViewById<TextInputEditText>(R.id.etUsername)
        val password = findViewById<TextInputEditText>(R.id.etpassword)

        val signIn = findViewById<Button>(R.id.signButton)
        signIn.setOnClickListener{
            // take references till node users
            val uniqueId = userName.text.toString()
            val passwordString = password.text.toString()

            if(uniqueId.isNotEmpty()){
                if(passwordString.isNotEmpty()) {
                    readData(uniqueId, passwordString)
                }
                else{
                    Toast.makeText(this, "Enter Password", Toast.LENGTH_SHORT).show()
                }
            }else{
                Toast.makeText(this, "Invalid Input", Toast.LENGTH_SHORT).show()
            }
        }
    } // onreate method over
    private fun readData(uniqueId: String, pass: String){
        databaseReference = FirebaseDatabase.getInstance().getReference("Users")
        databaseReference.child(uniqueId).get().addOnSuccessListener {
            // If usr exist of not
            if(it.exists()){
                val email = it.child("email").value
                val name = it.child("name").value
                val password = it.child("password").value
                val unique = it.child("uniqueId").value
                databaseReference.child(pass).get().addOnSuccessListener { p ->
                    if(p.exists()) {
                        val intent = Intent(this, Profile::class.java)
                        intent.putExtra(KEY1, email.toString())
                        intent.putExtra(KEY2, name.toString())
                        intent.putExtra(KEY3, password.toString())
                        intent.putExtra(KEY4, unique.toString())
                        startActivity(intent)
                    }
                    else{
                        Toast.makeText(this, "Wrong Password", Toast.LENGTH_SHORT).show()
                    }
                }.addOnFailureListener{
                    Toast.makeText(this, "Wrong Password", Toast.LENGTH_SHORT).show()
                }
            }
            else{
                Toast.makeText(this, "Username doesn't exist", Toast.LENGTH_SHORT).show()
            }
        }.addOnFailureListener{
            Toast.makeText(this, "Username not found", Toast.LENGTH_SHORT).show()
        }
    }
}