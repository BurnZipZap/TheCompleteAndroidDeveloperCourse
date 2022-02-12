package com.example.a1helloworldapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.a1helloworldapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        //super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun onClickButton1(view: View?) {
        val editText = findViewById<EditText>(R.id.editNameField);
        val name = editText.text
        Log.i("Info","Button1: " + name)
        Toast.makeText(this, "Button1" + name, Toast.LENGTH_SHORT).show()
    }

    fun onClickButton2(view: View?) {
        val editText = binding.editNameField.text;
        Log.i("Info","Button2: " + editText)
        Toast.makeText(this, "Button2: " + editText, Toast.LENGTH_SHORT).show()
    }
}