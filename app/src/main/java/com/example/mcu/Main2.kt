package com.example.mcu

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mcu.R
import com.example.mcu.databinding.ActivityMain2Binding

class Main2 : AppCompatActivity() {
    private var _binding: ActivityMain2Binding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = intent

        val name = intent.getStringExtra("avengername")

        binding.textView.text = name
        val cwg = Global

        val picFinal = cwg.chosen_pic
        binding.imageView.setImageBitmap(picFinal)
    }
}