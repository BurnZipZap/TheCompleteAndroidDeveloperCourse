package com.example.a6animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.a6animation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun fade(view: View){
        var bartImage = binding.bartView
        var homerImage = binding.homerView
        /*if(bartImage.alpha < 0.1f){
            bartImage.animate().alpha(1.0f).setDuration(2000)
            homerImage.animate().alpha(0.0f).setDuration(2000)
        }else{
            bartImage.animate().alpha(0.0f).setDuration(2000)
            homerImage.animate().alpha(1.0f).setDuration(2000)
        }*/
        /*bartImage.animate().translationXBy(-200f).setDuration(1000)
        bartImage.animate().translationYBy(1000f).setDuration(1000)*/
        bartImage.animate().rotation(1800f).alpha(0f).setDuration(1000)

    }
}