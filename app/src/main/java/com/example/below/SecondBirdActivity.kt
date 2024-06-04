package com.example.below

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondBirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second_bird)

        val btnPrev1 = findViewById<ImageView>(R.id.btnPrev1)
        val btnNext1 = findViewById<ImageView>(R.id.btnNext1)

        btnPrev1.setOnClickListener{
            finish()
        }

        btnNext1.setOnClickListener {
            val intent = Intent(this,ThirdBirdActivity::class.java)
            startActivity(intent)
        }


        }
    }
