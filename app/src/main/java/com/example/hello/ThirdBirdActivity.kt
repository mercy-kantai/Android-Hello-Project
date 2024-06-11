package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityThirdBirdBinding
import com.squareup.picasso.Picasso

class ThirdBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityThirdBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnNext2.setOnClickListener {
            val intent = Intent(this, FourthBirdActivity::class.java)
            startActivity(intent)
        }
        binding.btnPrev2.setOnClickListener {
            finish()
        }
        Picasso.get()
            .load("https://i.pinimg.com/236x/d0/85/26/d08526337560ba39e065324bf7b9ed76.jpg")
            .into(binding.imageView3)

    }
}