package com.example.below

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ThirdBirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third_bird)

        val btnPrev2 = findViewById<ImageView>(R.id.btnPrev2)
        val btnNext2 = findViewById<ImageView>(R.id.btnNext2)

        btnPrev2.setOnClickListener{
            finish()
        }

        btnNext2.setOnClickListener {
            val intent = Intent(this,FourthBirdActivity::class.java)
            startActivity(intent)
        }

    }
}