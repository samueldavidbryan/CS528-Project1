package com.example.screen2

import android.R.*
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var clickCountLeft = 0
    private var clickCountCenter = 0
    private var clickCountRight = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val leftImage: ImageView = findViewById<ImageView>(R.id.imageView1)
        val text1: TextView = findViewById<TextView>(R.id.textView1)
        leftImage.setOnClickListener {
            clickCountLeft++
            text1.text = "You have pressed picture 1 $clickCountLeft times"
        }

        val centerImage: ImageView = findViewById<ImageView>(R.id.imageView2)
        val text2: TextView = findViewById<TextView>(R.id.textView2)
        centerImage.setOnClickListener {
            clickCountCenter++
            text2.text = "You have pressed picture 2 $clickCountCenter times"
        }

        val rightImage: ImageView = findViewById<ImageView>(R.id.imageView3)
        val text3: TextView = findViewById<TextView>(R.id.textView3)
        rightImage.setOnClickListener {
            clickCountRight++
            text3.text = "You have pressed picture 3 $clickCountRight times"
        }

    }
}