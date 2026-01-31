package com.example.firstappdubininkorneeva

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.firstappdubininkorneeva.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        button_click()
    }

    fun button_click ()
    {
        binding.button2.setOnClickListener {
            binding.editTextNumber.setText((1..6).random().toString())
            binding.textView3.text = getString(R.string.roll_dice_text_change)
        }
    }
}