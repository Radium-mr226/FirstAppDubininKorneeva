package com.example.firstappdubininkorneeva

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        button_click()
    }
    fun button_click ()
    {
        val button_cube = findViewById<Button>(R.id.button2)
        val result_throw = findViewById<EditText>(R.id.editTextNumber)
        val ex_text = findViewById<TextView>(R.id.textView3)

        button_cube.setOnClickListener {

            result_throw.setText((1..6).random().toString())
            ex_text.setText("Выводиться случайное число, выпавшее на кубике")
        }
    }
}