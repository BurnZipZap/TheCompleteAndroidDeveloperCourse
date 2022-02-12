package com.example.a2loginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.a2loginapp.databinding.ActivityMainBinding
import android.widget.Toast




class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun onClickButton(view: View?) {
        Toast.makeText(this, "Info: ${binding.emailField.text} " + binding.passField.text, Toast.LENGTH_SHORT).show()
    }
}