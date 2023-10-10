package com.example.screen3

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import com.example.screen3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        binding = ActivityMainBinding.inflate(layoutInflater)

        val myWebView: WebView = findViewById(R.id.myWebView)
        val button: Button = findViewById(R.id.button)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        myWebView.webViewClient = WebViewClient()
        myWebView.loadUrl("https://www.duckduckgo.com")

        button.setOnClickListener{
            myWebView.loadUrl("https://www.duckduckgo.com")
        }

        button2.setOnClickListener{
            myWebView.loadUrl("https://www.weather.com")
        }

        button3.setOnClickListener{
            myWebView.loadUrl("https://www.wpi.edu")
        }



    }
}