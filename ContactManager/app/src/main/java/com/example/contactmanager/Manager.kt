package com.example.contactmanager


import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class Manager : AppCompatActivity() {


    // Data parsing to next activity
    companion object{
        const val KEY1 = "com.example.contactManager.KEY1"
        const val KEY2 = "com.example.contactManager.KEY2"
        const val KEY3 = "com.example.contactManager.KEY3"

    }

    lateinit var nameM : String
    lateinit var phoneM : String
    lateinit var addressM : String

    // for database
    private lateinit var database : DatabaseReference

    // Create a variable of type Dialog
    lateinit var dialog: Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manager)

        var myButton = findViewById<Button>(R.id.addBtn)

        dialog = Dialog(this)
        dialog.setContentView(R.layout.alert_box)
//        dialog.window?.setBackgroundDrawable(getDrawable(drawable.alert_box))

        var name = findViewById<TextView>(R.id.mName)
        var phone = findViewById<TextView>(R.id.mPhone)
        var address = findViewById<TextView>(R.id.mAddress)


        myButton.setOnClickListener {
            var mName = name.text.toString()
            var mPhone = phone.text.toString()
            var mAddress = address.text.toString()

            val manDetails = ManagerDetails(mName, mPhone, mAddress)

            if(mName==""){
                Toast.makeText(this, "Enter Name", Toast.LENGTH_SHORT).show()
            }
            else if(mPhone==""){
                Toast.makeText(this, "Enter Phone", Toast.LENGTH_SHORT).show()
            }
            else if(mAddress == ""){
                Toast.makeText(this, "Enter Address ", Toast.LENGTH_SHORT).show()
            }

            if(mPhone.length != 10){
                Toast.makeText(this, "Enter 10 digit phone", Toast.LENGTH_SHORT).show()
            }
            else{
                database = FirebaseDatabase.getInstance().getReference("Manager")
                database.child(mPhone).setValue(manDetails).addOnSuccessListener {
//                  Toast.makeText(this, "Details Stored", Toast.LENGTH_SHORT).show()
                    // Creating Button for the custom_dialog.xml design
                    var buttonGood = dialog.findViewById<Button>(R.id.Good)
                    var buttonFeedback = dialog.findViewById<Button>(R.id.Feedback)

                    buttonGood.setOnClickListener {
                        dialog.dismiss()
                    }

                    buttonFeedback.setOnClickListener {
                        val nameM = name.text.toString()
                        val phoneM = phone.text.toString()
                        val addressM = address.text.toString()

                        var intent = Intent(this, Details::class.java)
                        intent.putExtra(KEY1, nameM)
                        intent.putExtra(KEY2, phoneM)
                        intent.putExtra(KEY3, addressM)
                        startActivity(intent);

                        name.setText("")
                        phone.setText("")
                        address.setText("")
                        dialog.dismiss()
                    }
                    dialog.show()
                }.addOnCanceledListener {
                     Toast.makeText(this, "Attempt Failed", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}