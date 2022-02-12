package com.example.a7tictactoe

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.core.view.children
import com.example.a7tictactoe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    var activePlayer = 0
    var gameState = mutableListOf(2,2,2,2,2,2,2,2,2)
    var gameActive = true
    val winningsPositions = listOf(
        listOf(0,1,2),
        listOf(3,4,5),
        listOf(6,7,8),
        listOf(0,3,6),
        listOf(1,4,7),
        listOf(2,5,8),
        listOf(0,4,8),
        listOf(2,4,6)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun dropIn(view: View){
        val slotImage = view as ImageView
        var tappedSlot = slotImage.tag.toString().toInt()

        if(gameState[tappedSlot] != 2) return
        if(!gameActive) return
        gameState[tappedSlot] = activePlayer
        Log.i("active", activePlayer.toString())
        Log.i("game state", gameState.toString())


        for (winPosition in winningsPositions){
            if(gameState[winPosition[0]] == gameState[winPosition[1]] && gameState[winPosition[1]] == gameState[winPosition[2]] && gameState[winPosition[2]] != 2){
                if(gameState[winPosition[0]] == 0) {
                    Toast.makeText(this, "X win", Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(this, "O win", Toast.LENGTH_SHORT).show()
                }
                gameActive = false
            }
        }

        slotImage.translationY = -2000f
        if(activePlayer == 1) {
            slotImage.setImageResource(R.drawable.tic_tac_toe_o)
            activePlayer = 0
        }else{
            slotImage.setImageResource(R.drawable.tic_tac_toe_x)
            activePlayer = 1
        }
        slotImage.animate().translationYBy(2000f).rotation(1800f).setDuration(500)
    }

    fun restart(view: View){
        gameActive = true
        gameState = mutableListOf(2,2,2,2,2,2,2,2,2)
        binding.root.children.forEach {
            if(it !is Button){
                val slot: ImageView = it as ImageView
                if(slot.tag != null){
                    slot.setImageDrawable(null)
                }
            }
        }
    }
}