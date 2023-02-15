package com.example.miniproject

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class LearnJs : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn_html)

        val htmlWeb = findViewById<WebView>(R.id.htmlweb)
        webViewSetup(htmlWeb)

    }
    @SuppressLint("SetJavaScriptEnabled")
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetup (webView :  WebView){
        webView.webViewClient = WebViewClient()
        val javaScript = "https://developer.mozilla.org/en-US/docs/Web/JavaScript"

        webView.apply {
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            loadUrl(javaScript)
        }
    }
}