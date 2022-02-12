package com.example.a8playvideo

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import com.example.a8playvideo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val video = binding.videoView
        var mediaController = MediaController(this)
        video.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.demovideo_byproject))
        video.setMediaController(mediaController)
        video.start()
    }
}