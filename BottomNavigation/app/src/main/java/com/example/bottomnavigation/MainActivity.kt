package com.example.bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val bottomView = findViewById<BottomNavigationView>(R.id.bottomNavigation)

        replaceWithFragment(Home())
        // by default home fragment should be visible


        bottomView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home -> replaceWithFragment(Home())
                R.id.search -> replaceWithFragment(Search())
                R.id.profile -> replaceWithFragment(Profile())
                else -> {

                }
            }
            true
        }
    }

    private fun replaceWithFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.framelayout, fragment)
        fragmentTransaction.commit()
    }
}