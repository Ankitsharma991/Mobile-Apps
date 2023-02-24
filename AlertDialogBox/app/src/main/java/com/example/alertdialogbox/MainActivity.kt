package com.example.alertdialogbox

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.alertdialogbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener{
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("Are You Sure?")
            builder1.setMessage("Do you want to close the App?")
            builder1.setIcon(R.drawable.ic_baseline_exit_to_app_24)
            builder1.setPositiveButton("Yes", DialogInterface.OnClickListener { dialogInterface, i->
                // what action should be performed when yes is clicked
                finish()
            })
            builder1.setNegativeButton("cancel", DialogInterface.OnClickListener{ dialogInterface, p->
                // What to do when no is clicked
            })
            builder1.show()
        }
        binding.btn2.setOnClickListener {
            val options = arrayOf("Gulab Jamun", "Rasmallai", "Kaju Katli", "Rasbhari", "Jalebi", "Other")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("Select your Favourite Sweets")
            var c : String
            builder2.setSingleChoiceItems(options, 0, DialogInterface.OnClickListener{dialog, which->
                // action after selecting an options
                c = options[which]
                Toast.makeText(this, "$c selected", Toast.LENGTH_SHORT).show()
            })
            builder2.setPositiveButton("Select", DialogInterface.OnClickListener{dialog, b->
                Toast.makeText(this, "Selection confirmed", Toast.LENGTH_SHORT).show()
            })
            builder2.setNegativeButton("Cancel", DialogInterface.OnClickListener{dialog, p->
            })
            builder2.show()
        }

        binding.btn3.setOnClickListener {
            val options = arrayOf("Facebook", "Instagram", "Linkedin", "Twitter", "SnapChat", "Other")
            val builder3 = AlertDialog.Builder(this)
            builder3.setTitle("Select your Favourite Sweets")
            var c : String
            builder3.setMultiChoiceItems(options, null, DialogInterface.OnMultiChoiceClickListener{dialog, w, ischecked ->
                Toast.makeText(this, "${options[w]} selected", Toast.LENGTH_SHORT).show()
            })
            builder3.setPositiveButton("Select", DialogInterface.OnClickListener{dialog, b->
                Toast.makeText(this, "Selection confirmed", Toast.LENGTH_SHORT).show()
            })
            builder3.setNegativeButton("Cancel", DialogInterface.OnClickListener{dialog, p->
            })
            builder3.show()
        }
    }
}