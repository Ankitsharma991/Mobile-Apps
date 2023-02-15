package com.example.webview

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val wbView = findViewById<WebView>(R.id.wbView)
        webViewSetup(wbView)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetup(wb: WebView){
        wb.webViewClient = WebViewClient()

        wb.apply {
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            loadUrl("https://ankitsharma991.hashnode.dev/")
        }
    }
}