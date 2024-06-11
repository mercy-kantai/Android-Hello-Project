package com.example.hello

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityFifthBirdBinding
import com.squareup.picasso.Picasso

class FifthBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityFifthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFifthBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnPrevious4.setOnClickListener {
            finish()
        }
        Picasso.get()
            .load("https://i.pinimg.com/236x/fa/80/90/fa80907ffadea51ec99d0ae815e84db6.jpg")
            .into(binding.imageView11)


    }
}