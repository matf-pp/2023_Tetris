package com.example.tetrisgame

class Level {
    companion object {

        val next2X = arrayOf(
            arrayOf(850f, 900f, 950f),
            arrayOf(850f, 900f, 950f),
            arrayOf(850f, 900f, 950f),
            arrayOf(850f, 900f, 950f)
        )

        val next2Y = arrayOf(
            arrayOf(50f, 50f, 50f),
            arrayOf(100f, 100f, 100f),
            arrayOf(150f, 150f, 150f),
            arrayOf(200f, 200f, 200f)
        )

        var next2Z = arrayOf(
            arrayOf(0, 0, 0),
            arrayOf(0, 0, 0),
            arrayOf(0, 0, 0),
            arrayOf(0, 0, 0)
        )

        var score = 0
        var best = 0
        var level = 1

        val X = arrayOf(
            arrayOf(0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f),
            arrayOf(0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f),
            arrayOf(0f, 80f, 160f, 240f, 320f, 400f, 480f, 560f, 640f, 720f),
            arrayOf(0f, 80f, 160f, 240f, 320f, 400f, 480f, 560f, 640f, 720f),
            arrayOf(0f, 80f, 160f, 240f, 320f, 400f, 480f, 560f, 640f, 720f),
            arrayOf(0f, 80f, 160f, 240f, 320f, 400f, 480f, 560f, 640f, 720f),
            arrayOf(0f, 80f, 160f, 240f, 320f, 400f, 480f, 560f, 640f, 720f),
            arrayOf(0f, 80f, 160f, 240f, 320f, 400f, 480f, 560f, 640f, 720f),
            arrayOf(0f, 80f, 160f, 240f, 320f, 400f, 480f, 560f, 640f, 720f),
            arrayOf(0f, 80f, 160f, 240f, 320f, 400f, 480f, 560f, 640f, 720f),
            arrayOf(0f, 80f, 160f, 240f, 320f, 400f, 480f, 560f, 640f, 720f),
            arrayOf(0f, 80f, 160f, 240f, 320f, 400f, 480f, 560f, 640f, 720f),
            arrayOf(0f, 80f, 160f, 240f, 320f, 400f, 480f, 560f, 640f, 720f),
            arrayOf(0f, 80f, 160f, 240f, 320f, 400f, 480f, 560f, 640f, 720f),
            arrayOf(0f, 80f, 160f, 240f, 320f, 400f, 480f, 560f, 640f, 720f),
            arrayOf(0f, 80f, 160f, 240f, 320f, 400f, 480f, 560f, 640f, 720f),
            arrayOf(0f, 80f, 160f, 240f, 320f, 400f, 480f, 560f, 640f, 720f),
            arrayOf(0f, 80f, 160f, 240f, 320f, 400f, 480f, 560f, 640f, 720f),
            arrayOf(0f, 80f, 160f, 240f, 320f, 400f, 480f, 560f, 640f, 720f),
            arrayOf(0f, 80f, 160f, 240f, 320f, 400f, 480f, 560f, 640f, 720f),
            arrayOf(0f, 80f, 160f, 240f, 320f, 400f, 480f, 560f, 640f, 720f),
            arrayOf(0f, 80f, 160f, 240f, 320f, 400f, 480f, 560f, 640f, 720f)
        )

        val Y = arrayOf(
            arrayOf(0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f),
            arrayOf(0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f),
            arrayOf(0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f),
            arrayOf(80f, 80f, 80f, 80f, 80f, 80f, 80f, 80f, 80f, 80f),
            arrayOf(160f, 160f, 160f, 160f, 160f, 160f, 160f, 160f, 160f, 160f),
            arrayOf(240f, 240f, 240f, 240f, 240f, 240f, 240f, 240f, 240f, 240f),
            arrayOf(320f, 320f, 320f, 320f, 320f, 320f, 320f, 320f, 320f, 320f),
            arrayOf(400f, 400f, 400f, 400f, 400f, 400f, 400f, 400f, 400f, 400f),
            arrayOf(480f, 480f, 480f, 480f, 480f, 480f, 480f, 480f, 480f, 480f),
            arrayOf(560f, 560f, 560f, 560f, 560f, 560f, 560f, 560f, 560f, 560f),
            arrayOf(640f, 640f, 640f, 640f, 640f, 640f, 640f, 640f, 640f, 640f),
            arrayOf(720f, 720f, 720f, 720f, 720f, 720f, 720f, 720f, 720f, 720f),
            arrayOf(800f, 800f, 800f, 800f, 800f, 800f, 800f, 800f, 800f, 800f),
            arrayOf(880f, 880f, 880f, 880f, 880f, 880f, 880f, 880f, 880f, 880f),
            arrayOf(960f, 960f, 960f, 960f, 960f, 960f, 960f, 960f, 960f, 960f),
            arrayOf(1040f, 1040f, 1040f, 1040f, 1040f, 1040f, 1040f, 1040f, 1040f, 1040f),
            arrayOf(1120f, 1120f, 1120f, 1120f, 1120f, 1120f, 1120f, 1120f, 1120f, 1120f),
            arrayOf(1200f, 1200f, 1200f, 1200f, 1200f, 1200f, 1200f, 1200f, 1200f, 1200f),
            arrayOf(1280f, 1280f, 1280f, 1280f, 1280f, 1280f, 1280f, 1280f, 1280f, 1280f),
            arrayOf(1360f, 1360f, 1360f, 1360f, 1360f, 1360f, 1360f, 1360f, 1360f, 1360f),
            arrayOf(1440f, 1440f, 1440f, 1440f, 1440f, 1440f, 1440f, 1440f, 1440f, 1440f),
            arrayOf(1520f, 1520f, 1520f, 1520f, 1520f, 1520f, 1520f, 1520f, 1520f, 1520f)
        )

        var posMatZ = mutableListOf(
            arrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
            arrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
            arrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
            arrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
            arrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
            arrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
            arrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
            arrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
            arrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
            arrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
            arrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
            arrayOf(0, 1, 0, 0, 0, 0, 0, 0, 0, 0),
            arrayOf(0, 2, 0, 0, 0, 0, 0, 0, 0, 0),
            arrayOf(0, 3, 0, 0, 0, 0, 0, 0, 0, 0),
            arrayOf(0, 4, 0, 0, 0, 0, 0, 0, 0, 0),
            arrayOf(0, 5, 0, 0, 0, 0, 0, 0, 0, 0),
            arrayOf(0, 6, 0, 0, 0, 0, 0, 0, 0, 0),
            arrayOf(0, 7, 0, 0, 0, 0, 0, 0, 0, 0),
            arrayOf(0, 8, 0, 0, 0, 0, 0, 0, 0, 0),
            arrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
            arrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
            arrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        )

        fun restartLevel() {
            level = 1
            score = 0
            Tetromino.speed = 500

            Tetromino.next2nd = (1..7).random()
            Tetromino.next3rd = (1..7).random()
            Tetromino.next4th = (1..7).random()

            for (i in 0..21) {
                for (j in 0..9) {
                    posMatZ[i][j] = 0
                }
            }
        }

        fun checkGameOver(): Boolean {
            for (i in Tetromino.tetrominoXPos) {
                if (i < 2) {
                    return true
                }
            }
            return false
        }

        fun removeOldPosition() {
            posMatZ[Tetromino.tetrominoXPos[0]][Tetromino.tetrominoYPos[0]] = 0
            posMatZ[Tetromino.tetrominoXPos[1]][Tetromino.tetrominoYPos[1]] = 0
            posMatZ[Tetromino.tetrominoXPos[2]][Tetromino.tetrominoYPos[2]] = 0
            posMatZ[Tetromino.tetrominoXPos[3]][Tetromino.tetrominoYPos[3]] = 0
        }

        fun rowRemoval(index: Int) {
            for (i in 0..9)
                posMatZ[index][i] = 0
            for (i in index downTo 2)
                posMatZ[i] = posMatZ[i - 1].also { posMatZ[i - 1] = posMatZ[i] } // swap
        }

        fun insertNewPosition() {

            posMatZ[Tetromino.tetrominoXPos[0]][Tetromino.tetrominoYPos[0]] = Tetromino.colorCode
            posMatZ[Tetromino.tetrominoXPos[1]][Tetromino.tetrominoYPos[1]] = Tetromino.colorCode
            posMatZ[Tetromino.tetrominoXPos[2]][Tetromino.tetrominoYPos[2]] = Tetromino.colorCode
            posMatZ[Tetromino.tetrominoXPos[3]][Tetromino.tetrominoYPos[3]] = Tetromino.colorCode
        }


        fun checkRowsForCleaning() {
            for ((index, i) in posMatZ.withIndex()) {
                if (i[0] > 1 &&
                    i[1] > 1 &&
                    i[2] > 1 &&
                    i[3] > 1 &&
                    i[4] > 1 &&
                    i[5] > 1 &&
                    i[6] > 1 &&
                    i[7] > 1 &&
                    i[8] > 1 &&
                    i[9] > 1
                ) {
                    rowRemoval(index)
                    score += 1
                    if (score % 10 == 0) {
                        level++
                        Tetromino.speed -= 50
                    }

                }
            }
        }

    }
}