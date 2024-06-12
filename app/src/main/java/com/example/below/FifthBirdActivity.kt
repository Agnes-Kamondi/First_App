package com.example.below

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.below.databinding.ActivityFifthBirdBinding
import com.squareup.picasso.Picasso

class FifthBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityFifthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFifthBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPrev4.setOnClickListener {
            finish()
        }
        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1601168049797-351a4abb0b2f?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NDZ8fGJpcmR8ZW58MHx8MHx8fDA%3D")
            .centerCrop()
            .resize(500,700)
            .into(binding.imageView11)


    }
}
