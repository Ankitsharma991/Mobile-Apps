package com.example.miniproject

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.concurrent.CyclicBarrier


class Technologies : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_technologies)

        val react = "https://reactjs.org/docs/getting-started.html"
        val html = "https://developer.mozilla.org/en-US/docs/Web/HTML"
        val css = "https://developer.mozilla.org/en-US/docs/Web/CSS"
        val javaScript = "https://developer.mozilla.org/en-US/docs/Web/JavaScript"
        val nodejs = "https://reactjs.org/docs/getting-started.html"
        val mongoDb = "https://www.mongodb.com/docs/"
        val androidStudio = "https://developer.android.com/docs"
        val bitcoin = "https://developer.bitcoin.org/reference/"
        val c = "https://devdocs.io/c/"
        val colab = "https://colab.research.google.com/"
        val csharp = "https://learn.microsoft.com/en-us/dotnet/csharp/"
        val cryptography = "https://cryptography.io/en/latest/"
        val etherium = "https://ethereum.org/en/developers/docs/"
        val fireBase = "https://firebase.google.com/docs"
        val flutter = "https://docs.flutter.dev/"
        val firewall = "https://firewalld.org/documentation/"
        val golang = "https://go.dev/doc/"
        val hyperledger = "https://hyperledger-fabric.readthedocs.io/en/release-2.5/"
        val ipadderess = "https://learn.microsoft.com/en-us/windows-server/networking/"
        val java = "https://docs.oracle.com/en/java/"
        val kotlin = "https://kotlinlang.org/docs/home.html"
        val matlab = "https://www.mathworks.com/help/matlab/"
        val objC = "https://developer.apple.com/library/archive/documentation/Cocoa/Conceptual/ProgrammingWithObjectiveC/Introduction/Introduction.html"
        val pyTorch = "https://pytorch.org/docs/stable/index.html"
        val python = "https://docs.python.org/3/"
        val reactNative = "https://reactnative.dev/docs/getting-started"
        val ripple = "https://xrpl.org/docs.html"
        val skritLearn = "https://scikit-learn.org/stable/"
        val solidity = "https://docs.soliditylang.org/en/v0.8.18/"
        val swift = "https://www.swift.org/documentation/"
        val tenserFlow = "https://www.tensorflow.org/"
        val vpn = "https://learn.microsoft.com/en-us/azure/vpn-gateway/"
        val web3 = "https://web3js.readthedocs.io/en/v1.8.2/"

        val webBtn = findViewById<Button>(R.id.web)
        val andrBtn = findViewById<Button>(R.id.android)
        val iosBtn = findViewById<Button>(R.id.ios)
        val blockBtn = findViewById<Button>(R.id.block)
        val mlBtn = findViewById<Button>(R.id.ml)
        val cyberBtn = findViewById<Button>(R.id.cyber)

        val callBtn = findViewById<Button>(R.id.btncallme)

        webBtn.setOnClickListener{
            intent = Intent(applicationContext, WebDevelopment::class.java)
            startActivity(intent)

            Toast.makeText(applicationContext, "Web Development", Toast.LENGTH_SHORT).show()
        }
        andrBtn.setOnClickListener{
            intent = Intent(applicationContext, AndroidDevelopment::class.java)
            startActivity(intent)

            Toast.makeText(applicationContext, "Android Development", Toast.LENGTH_SHORT).show()
        }

        iosBtn.setOnClickListener{
            intent = Intent(applicationContext, IosDevelopment::class.java)
            startActivity(intent)

            Toast.makeText(applicationContext, "IOS Development", Toast.LENGTH_SHORT).show()

        }

        blockBtn.setOnClickListener{
            intent = Intent(applicationContext, BlockChain::class.java)
            startActivity(intent)

            Toast.makeText(applicationContext, "Blockchain Development", Toast.LENGTH_SHORT).show()

        }

        mlBtn.setOnClickListener{
            intent = Intent(applicationContext, MachineLearning::class.java)
            startActivity(intent)

            Toast.makeText(applicationContext, "Machine Learning", Toast.LENGTH_SHORT).show()

        }

        cyberBtn.setOnClickListener{
            intent = Intent(applicationContext, cyberSecurity::class.java)
            startActivity(intent)

            Toast.makeText(applicationContext, "Cyber Security", Toast.LENGTH_SHORT).show()

        }
        callBtn.setOnClickListener{
//            val callIntent = Intent(Intent.ACTION_DIAL)
//            callIntent.data = Uri.parse("tel : " + "9841294157")
//            startActivity(callIntent)
            val intent = Intent(Intent.ACTION_DIAL).apply {
                data = Uri.parse("tel: 9841294157")
            }
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }
        }
    }
}