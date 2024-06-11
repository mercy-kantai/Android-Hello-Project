package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivitySecondBirdBinding
import com.squareup.picasso.Picasso

class SecondBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivitySecondBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

      binding.btnNext1.setOnClickListener {
          val intent = Intent(this, ThirdBirdActivity::class.java)
          startActivity(intent)
      }
        binding.btnPrevious1.setOnClickListener {
            finish()
        }
        Picasso.get()
            .load("https://i.pinimg.com/236x/76/26/d1/7626d1b1ffaab13570c32fdf832275e2.jpg")
            .into(binding.imageView2)

    }
}