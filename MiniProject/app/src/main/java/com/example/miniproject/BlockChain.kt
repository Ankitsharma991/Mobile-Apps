package com.example.miniproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class BlockChain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_block_chain)

        val ethBtn = findViewById<ImageView>(R.id.etherium)
        val hpBtn = findViewById<ImageView>(R.id.hpledger)
        val jsBtn = findViewById<ImageView>(R.id.js)
        val bitcoinBtn = findViewById<ImageView>(R.id.bitcoin)
        val rippleBtn = findViewById<ImageView>(R.id.ripple)
        val webBtn = findViewById<ImageView>(R.id.web3)


        ethBtn.setOnClickListener{
            intent = Intent(applicationContext, LearnEthereum::class.java)
            startActivity(intent)

            Toast.makeText(applicationContext, "Learn Ethereum", Toast.LENGTH_SHORT).show()
        }

        hpBtn.setOnClickListener{
            intent = Intent(applicationContext, LearnHP::class.java)
            startActivity(intent)

            Toast.makeText(applicationContext, "Learn HyperLedger", Toast.LENGTH_SHORT).show()
        }

        jsBtn.setOnClickListener{
            intent = Intent(applicationContext, LearnJs::class.java)
            startActivity(intent)

            Toast.makeText(applicationContext, "Learn Javascript", Toast.LENGTH_SHORT).show()
        }

        bitcoinBtn.setOnClickListener{
            intent = Intent(applicationContext, LearnBitcoin::class.java)
            startActivity(intent)

            Toast.makeText(applicationContext, "Learn Bitcoin", Toast.LENGTH_SHORT).show()
        }

        rippleBtn.setOnClickListener{
            intent = Intent(applicationContext, LearnRipple::class.java)
            startActivity(intent)

            Toast.makeText(applicationContext, "Learn Ripple", Toast.LENGTH_SHORT).show()
        }

        webBtn.setOnClickListener{
            intent = Intent(applicationContext, LearnWeb3::class.java)
            startActivity(intent)

            Toast.makeText(applicationContext, "Learn Web3", Toast.LENGTH_SHORT).show()
        }
    }
}