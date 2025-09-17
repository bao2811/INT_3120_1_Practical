package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val logoImage = findViewById<ImageView>(R.id.logoImage)
        val text1 = findViewById<TextView>(R.id.text1)
        val text2 = findViewById<TextView>(R.id.text2)
        val text3 = findViewById<TextView>(R.id.text3)

        logoImage.setOnClickListener {
            logoImage.visibility = View.GONE
            text1.visibility = TextView.VISIBLE
            text2.visibility = TextView.VISIBLE
            text3.visibility = TextView.VISIBLE
        }
    }
}