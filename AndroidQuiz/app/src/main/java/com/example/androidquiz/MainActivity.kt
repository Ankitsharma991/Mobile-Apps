package com.example.androidquiz

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.androidquiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.exit.setOnClickListener{
            val build1 = AlertDialog.Builder(this)
            build1.setTitle("Are you Sure?")
            build1.setTitle("Do you want to exit from the Quiz?")
            build1.setIcon(R.drawable.ic_baseline_exit_to_app_24)
            build1.setPositiveButton("Yes", DialogInterface.OnClickListener{dialogInterface, i->
                finish()
            })
            build1.setNegativeButton("No", DialogInterface.OnClickListener{dialogInterface, p->
            })
            build1.show()
        }

        binding.btn1.setOnClickListener {
            val choices = arrayOf("A button that performs an action", "A screen in an Android app that displays user interface elements and interacts with the user", "A component in Android that handles background tasks", "None of the above.")
            val build2 = AlertDialog.Builder(this)
            build2.setTitle("What is an Activity in Android?")
            lateinit var Yourans: String
            build2.setSingleChoiceItems(choices, -1, DialogInterface.OnClickListener{dialog, a->
//                Toast.makeText()
                Yourans = choices[a]
            })
            build2.setPositiveButton("Submit", DialogInterface.OnClickListener{dialog, w->
                if(Yourans==choices[1]){
                    Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this, "Try again", Toast.LENGTH_SHORT).show()
                }
            })
            build2.setNegativeButton("Cancel", DialogInterface.OnClickListener{which, o->
//
            })
            build2.show()
        }

        binding.btn2.setOnClickListener {
            val choices = arrayOf( "A file that contains the compiled code and resources of an Android app", "A file that stores audio recordings in Android", "A file that stores images in Android", "All of the above")
            val build3 = AlertDialog.Builder(this)
            build3.setTitle("What is an APK file in Android?")
            lateinit var Yourans: String
            build3.setSingleChoiceItems(choices, -1, DialogInterface.OnClickListener{dialog, a->
//                Toast.makeText()
                Yourans = choices[a]
            })
            build3.setPositiveButton("Submit", DialogInterface.OnClickListener{dialog, w->
                if(Yourans==choices[0]){
                    Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this, "Try again", Toast.LENGTH_SHORT).show()
                }
            })
            build3.setNegativeButton("Cancel", DialogInterface.OnClickListener{which, o->
            })
            build3.show()
        }

        binding.btn3.setOnClickListener {
            val choices = arrayOf(" A class that represents a user interface element in Android", "A class that is used to pass data between components in Android" ,"A class that is used to perform network operations in Android", "All of the above")
            val build4 = AlertDialog.Builder(this)
            build4.setTitle("What is an Intent in Android?")
            lateinit var Yourans: String
            build4.setSingleChoiceItems(choices, -1, DialogInterface.OnClickListener{dialog, a->
//                Toast.makeText()
                Yourans = choices[a]
            })
            build4.setPositiveButton("Submit", DialogInterface.OnClickListener{dialog, w->
                if(Yourans==choices[1]){
                    Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this, "Try again", Toast.LENGTH_SHORT).show()
                }
            })
            build4.setNegativeButton("Cancel", DialogInterface.OnClickListener{which, o->
            })
            build4.show()
        }

        binding.btn4.setOnClickListener {
            val choices = arrayOf(" It defines the user interface elements of the app", "It contains the source code of the app" ,"It defines the behavior and properties of the app's components", "All of the above")
            val build5 = AlertDialog.Builder(this)
            build5.setTitle("What is the role of the AndroidManifest.xml file in an Android app?")
            lateinit var Yourans: String
            build5.setSingleChoiceItems(choices, -1, DialogInterface.OnClickListener{dialog, a->
//                Toast.makeText()
                Yourans = choices[a]
            })
            build5.setPositiveButton("Submit", DialogInterface.OnClickListener{dialog, w->
                if(Yourans==choices[2]){
                    Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this, "Try again", Toast.LENGTH_SHORT).show()
                }
            })
            build5.setNegativeButton("Cancel", DialogInterface.OnClickListener{which, o->
            })
            build5.show()
        }

        binding.btn5.setOnClickListener {
            val choices = arrayOf("A tool used to debug Android apps","A tool used to sign Android apps","Both of the above", "A build system used to automate the building, testing, and deployment of Android apps")
            val build6 = AlertDialog.Builder(this)
            build6.setTitle("What is Gradle in Android development?")
            lateinit var Yourans: String
            build6.setSingleChoiceItems(choices, -1, DialogInterface.OnClickListener{dialog, a->
//                Toast.makeText()
                Yourans = choices[a]
            })
            build6.setPositiveButton("Submit", DialogInterface.OnClickListener{dialog, w->
                if(Yourans==choices[3]){
                    Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this, "Try again", Toast.LENGTH_SHORT).show()
                }
            })
            build6.setNegativeButton("Cancel", DialogInterface.OnClickListener{which, o->
            })
            build6.show()
        }
    }
}