package com.example.tetrisgame

class GhostTetro {
    companion object {

        fun insertGhost(i: Int) {
            if (Tetromino.tetrominoXPos[0] + i < 22 &&
                Tetromino.tetrominoXPos[1] + i < 22 &&
                Tetromino.tetrominoXPos[2] + i < 22 &&
                Tetromino.tetrominoXPos[3] + i < 22
            ) if (
                Level.posMatZ[Tetromino.tetrominoXPos[0] + i][Tetromino.tetrominoYPos[0]] < 2 &&
                Level.posMatZ[Tetromino.tetrominoXPos[0] + i][Tetromino.tetrominoYPos[0]] < 2 &&
                Level.posMatZ[Tetromino.tetrominoXPos[0] + i][Tetromino.tetrominoYPos[0]] < 2 &&
                Level.posMatZ[Tetromino.tetrominoXPos[0] + i][Tetromino.tetrominoYPos[0]] < 2
            ) {
                Level.posMatZ[Tetromino.tetrominoXPos[0] + i][Tetromino.tetrominoYPos[0]] = 1
                Level.posMatZ[Tetromino.tetrominoXPos[1] + i][Tetromino.tetrominoYPos[1]] = 1
                Level.posMatZ[Tetromino.tetrominoXPos[2] + i][Tetromino.tetrominoYPos[2]] = 1
                Level.posMatZ[Tetromino.tetrominoXPos[3] + i][Tetromino.tetrominoYPos[3]] = 1
            }
        }

        fun setGhost() {
            removeGhost()
            for (i in 1..20) {
                if (Falling.landing(i)) {
                    insertGhost(i - 1)
                    break
                }
            }
        }

        private fun removeGhost() {
            for (i in 0..21) {
                for (j in 0..9) {
                    if (Level.posMatZ[i][j] == 1)
                        Level.posMatZ[i][j] = 0
                }
            }
        }
    }
}