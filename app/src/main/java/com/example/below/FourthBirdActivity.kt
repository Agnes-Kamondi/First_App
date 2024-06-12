package com.example.below

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.below.databinding.ActivityFourthBirdBinding
import com.squareup.picasso.Picasso

class FourthBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityFourthBirdBinding
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourthBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val btnPrev3 = findViewById<ImageView>(R.id.btnPrev3)
        val btnNext3 = findViewById<ImageView>(R.id.btnNext3)

        binding.btnPrev3.setOnClickListener{
            finish()
        }

        binding.btnNext3.setOnClickListener {
            val intent = Intent(this,FifthBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1512819432727-dbcb57a06f13?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzR8fGJpcmR8ZW58MHx8MHx8fDA%3D")
            .centerCrop()
            .resize(500,700)
            .into(binding.imageView8)
        }
    }
