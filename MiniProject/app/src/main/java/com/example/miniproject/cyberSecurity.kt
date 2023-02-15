package com.example.miniproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class cyberSecurity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cyber_security)

        val netBtn = findViewById<ImageView>(R.id.networking)
        val fwBtn = findViewById<ImageView>(R.id.firewall)
        val vpnBtn = findViewById<ImageView>(R.id.vpn)
        val cBtn = findViewById<ImageView>(R.id.c)
        val pyBtn = findViewById<ImageView>(R.id.python)
        val cryBtn = findViewById<ImageView>(R.id.crypto)


        netBtn.setOnClickListener{
            intent = Intent(applicationContext, LearnNet::class.java)
            startActivity(intent)

            Toast.makeText(applicationContext, "Learn Networking", Toast.LENGTH_SHORT).show()
        }

        fwBtn.setOnClickListener{
            intent = Intent(applicationContext, LearnFirewall::class.java)
            startActivity(intent)

            Toast.makeText(applicationContext, "Learn FireWall Protection", Toast.LENGTH_SHORT).show()
        }

        vpnBtn.setOnClickListener{
            intent = Intent(applicationContext, LearnVPN::class.java)
            startActivity(intent)

            Toast.makeText(applicationContext, "Learn VPN", Toast.LENGTH_SHORT).show()
        }

        cBtn.setOnClickListener{
            intent = Intent(applicationContext, LearnC::class.java)
            startActivity(intent)

            Toast.makeText(applicationContext, "Learn C Programming", Toast.LENGTH_SHORT).show()
        }

       pyBtn.setOnClickListener{
            intent = Intent(applicationContext, LearnPython::class.java)
            startActivity(intent)

            Toast.makeText(applicationContext, "Learn Python", Toast.LENGTH_SHORT).show()
        }

        cryBtn.setOnClickListener{
            intent = Intent(applicationContext, LearnCrypto::class.java)
            startActivity(intent)

            Toast.makeText(applicationContext, "Learn Cryptography", Toast.LENGTH_SHORT).show()
        }
    }
}