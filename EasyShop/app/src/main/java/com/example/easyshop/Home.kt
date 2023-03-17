package com.example.easyshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView


class Home : AppCompatActivity() {
    var currentImage = 0
    lateinit var image : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        supportActionBar?.hide()
        val prev = findViewById<ImageButton>(R.id.back)
        val next = findViewById<ImageButton>(R.id.forward)

        prev.setOnClickListener{
            val idCurrentImageString = "pic$currentImage"
            val idCurrentImageInt = this.resources.getIdentifier(idCurrentImageString, "id", packageName)
            image = findViewById(idCurrentImageInt)
            image.alpha = 0f

            currentImage = (6+ currentImage -1)%6
            val idImageToShowString = "pic$currentImage"
            val idImageToShowInt = this.resources.getIdentifier(idImageToShowString, "id", packageName)
            image = findViewById(idImageToShowInt)
            image.alpha = 1f
        }

        next.setOnClickListener{
            val idCurrentImageString = "pic$currentImage"
            val idCurrentImageInt = this.resources.getIdentifier(idCurrentImageString, "id", packageName)
            image = findViewById(idCurrentImageInt)
            image.alpha = 0f

            currentImage = (6+ currentImage + 1)%6
            val idImageToShowString = "pic$currentImage"
//            convert String id into integer address associated with it
            val idImageToShowInt = this.resources.getIdentifier(idImageToShowString, "id", packageName)
            image = findViewById(idImageToShowInt)
            image.alpha = 1f
        }


        val bottomView = findViewById<BottomNavigationView>(R.id.bottomNavigation)
        bottomView.selectedItemId = R.id.home
        replaceTheViewWithFragment(Fragment_Home())

        bottomView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home-> replaceTheViewWithFragment(Fragment_Home())
                R.id.cart-> replaceTheViewWithFragment(Fragment_Cart())
                R.id.search-> replaceTheViewWithFragment(Fragment_Search())
                R.id.dash-> replaceTheViewWithFragment(Fragment_Dash())
                R.id.profile-> replaceTheViewWithFragment(Fragment_Profile())
                else -> {
                    replaceTheViewWithFragment(Fragment_Home())
                }
            }
            true
        }

    }
    private fun replaceTheViewWithFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.commit()
    }
}