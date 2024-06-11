package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityFourthBirdBinding
import com.squareup.picasso.Picasso

class FourthBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityFourthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourthBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNext3.setOnClickListener {
            val intent = Intent(this, FifthBirdActivity::class.java)
            startActivity(intent)
        }
        binding.btnPrevious3.setOnClickListener {
            finish()
        }
        Picasso.get()
            .load("https://i.pinimg.com/236x/09/14/0e/09140edd79c40add95af0cea63ecf0c1.jpg")
            .into(binding.imageView8)

    }
}