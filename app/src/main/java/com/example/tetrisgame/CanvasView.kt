package com.example.tetrisgame

import android.view.View
import android.util.AttributeSet
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint

class CanvasView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    override fun onDraw(canvas: Canvas?) {

        super.onDraw(canvas)

        val tetromino = Paint()

        val scoreText = Paint()
        scoreText.color = Color.LTGRAY
        scoreText.textSize = 100f
        canvas?.drawText(Level.score.toString(), 815f, 690f, scoreText);

        val levelText = Paint()
        levelText.color = Color.LTGRAY
        levelText.textSize = 100f
        canvas?.drawText(Level.level.toString(), 815f, 790f, levelText);

        tetromino.color = Color.GREEN
        val level = Paint()
        level.style = Paint.Style.STROKE
        level.strokeWidth = 1f
        level.color = Color.GRAY

        val bestText = Paint()
        bestText.color = Color.LTGRAY
        bestText.textSize = 100f
        canvas?.drawText(Level.best.toString(), 815f, 590f, bestText);

        canvas?.drawRect(1f, 1f, 797f, 1597f, level)

        for (i in 2..21) {
            for (j in 0..9) {
                when (Level.posMatZ[i][j]) {
                    0 -> tetromino.color = Color.rgb(20,20,20)
                    1 -> {
                        tetromino.color = Color.rgb(220,220,220)
                    }
                    2 -> tetromino.color = Color.rgb(0,0,220)       // I
                    3 -> tetromino.color = Color.rgb(255,255,0)     // O
                    4 -> tetromino.color = Color.rgb(128,0,128)    // T
                    5 -> tetromino.color = Color.rgb(0,150,150)       // J
                    6 -> tetromino.color = Color.rgb(255,127,0)     // L
                    7 -> tetromino.color = Color.rgb(0,255,0)      // S
                    8 -> tetromino.color = Color.rgb(255,0,0)        // Z
                }
                tetromino.alpha = 1000 // reset
                canvas?.drawRect(
                    Level.X[i][j] + 1,
                    Level.Y[i][j] + 1,
                    Level.X[i][j] + 76,
                    Level.Y[i][j] + 76,
                    tetromino
                )
            }
        }

        for (i in 0..3) {
            for (j in 0..2) {
                when (Level.next2Z[i][j]) {
                    0 -> tetromino.color = Color.rgb(20,20,20)
                    1 -> {
                        tetromino.color = Color.rgb(220,220,220)
                    }
                    2 -> tetromino.color = Color.rgb(0,0,220)       // I
                    3 -> tetromino.color = Color.rgb(255,255,0)       // O
                    4 -> tetromino.color = Color.rgb(128,0,128)       // T
                    5 -> tetromino.color = Color.rgb(0,150,150)       // J
                    6 -> tetromino.color = Color.rgb(255,127,0)       // L
                    7 -> tetromino.color = Color.rgb(0,255,0)         // S
                    8 -> tetromino.color = Color.rgb(255,0,0)         // Z
                }
                tetromino.alpha = 1000 // reset
                canvas?.drawRect(
                    Level.next2X[i][j] + 1,
                    Level.next2Y[i][j] + 1,
                    Level.next2X[i][j] + 48,
                    Level.next2Y[i][j] + 48,
                    tetromino
                )
            }
        }
    }
}