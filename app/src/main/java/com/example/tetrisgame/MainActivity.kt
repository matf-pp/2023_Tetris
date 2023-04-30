package com.example.tetrisgame

import android.content.Context
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        supportActionBar?.hide()

        button_rotate.setOnClickListener {
            if (Rotate.isRotable()) {
                Rotate.doRotate()
                canvas.invalidate()
            }
        }

        button_left.setOnClickListener {
            if (ToLeft.isMovableLeft()) {
                ToLeft.moveLeft()
                canvas.invalidate()
            }
        }
        button_right.setOnClickListener {
            if (ToRight.isMovableRight()) {
                ToRight.moveToRight()
                canvas.invalidate()
            }
        }
        button_fast_down.setOnClickListener {
            while (!Falling.landing(1)) {
                Falling.falling()
            }
        }
        // run
        game()
    }

    public fun game() {
        CoroutineScope(Dispatchers.IO).launch {
            Level.restartLevel()
            Tetromino.newPiece()
            Level.insertNewPosition()
            setBestScore()
            while (true) {
                if (Falling.landing(1)) {
                    Level.checkRowsForCleaning()
                    // provera da li je kraj
                    if (Level.checkGameOver()) {
                        newBestScore()
                        Level.restartLevel()
                    }
                    Tetromino.newPiece()
                    Level.insertNewPosition()
                } else {
                    Falling.falling()
                }
                delay(Tetromino.speed)
                canvas.invalidate()
            }
        }
    }
    private fun newBestScore(){
        val sharedPreference = getSharedPreferences("HIGH_SCORE", Context.MODE_PRIVATE)
        if (Level.score > sharedPreference.getInt("high_score", 0)) {
            var editor = sharedPreference.edit()
            editor.putInt("high_score", Level.score)
            editor.commit()
            Level.best = sharedPreference.getInt("high_score", 0)
        }
    }
    private fun setBestScore() {
        val sharedPreference = getSharedPreferences("HIGH_SCORE", Context.MODE_PRIVATE)
        Level.best = sharedPreference.getInt("high_score", 0)
    }
}