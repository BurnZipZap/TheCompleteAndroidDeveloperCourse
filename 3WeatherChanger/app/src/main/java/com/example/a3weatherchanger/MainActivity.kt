package com.example.a3weatherchanger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.ImageView
import com.example.a3weatherchanger.databinding.ActivityMainBinding
import android.widget.Toast
import androidx.core.view.isVisible


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun onClickButton(view: View?) {
        if(binding.imageView.tag.equals("storm")){
            binding.imageView.setImageResource(R.drawable.sunny_image_2)
            binding.imageView.setTag("sunny")
        }else{
            binding.imageView.setImageResource(R.drawable.storm_image_1)
            binding.imageView.setTag("storm")
        }
    }
}