package com.example.a4tempconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.a4tempconverter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun celsiusClick(view: View) {
        if (binding.tempField.text.isEmpty()) {
            Toast.makeText(this, "Empty field", Toast.LENGTH_SHORT).show()
        } else {
            val fahrenheit = Integer.parseInt(binding.tempField.text.toString())
            val celsius: Double = 5.0 / 9.0 * (fahrenheit - 32)
            Toast.makeText(
                this,
                String.format("%s Fahrenheit = %s Celsius", fahrenheit, celsius),
                Toast.LENGTH_SHORT
            ).show()
        }

    }

    fun fahrenheitClick(view: View) {
        if (binding.tempField.text.isEmpty()) {
            Toast.makeText(this, "Empty field", Toast.LENGTH_SHORT).show()
        } else {
            val celsius = Integer.parseInt(binding.tempField.text.toString())
            val fahrenheit: Double = 9.0 / 5.0 * celsius + 32
            Toast.makeText(
                this,
                String.format("%s Celsius = %s Fahrenheit", celsius, fahrenheit),
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}