package com.example.crystal_ball

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.crystal_ball.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvprediction.setOnClickListener{
            binding.tvprediction.text = getPrediction()
        }
    }
    private fun getPrediction(): String{
        return resources.getStringArray(R.array.predictions)[randomNumber()]
    }
    private fun randomNumber(): Int{
        val size = resources.getStringArray(R.array.predictions).size - 1
        return (0..size).random()
    }
}