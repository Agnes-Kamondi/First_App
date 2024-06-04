package com.example.below

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FourthBirdActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fourth_bird)
        val btnPrev3 = findViewById<ImageView>(R.id.btnPrev3)
        val btnNext3 = findViewById<ImageView>(R.id.btnNext3)

        btnPrev3.setOnClickListener{
            finish()
        }

        btnNext3.setOnClickListener {
            val intent = Intent(this,FifthBirdActivity::class.java)
            startActivity(intent)
        }
        }
    }
