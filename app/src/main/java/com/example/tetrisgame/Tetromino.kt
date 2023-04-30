package com.example.tetrisgame

class Tetromino {
    companion object {
        var tetrominoXPos = arrayOf(0)
        var tetrominoYPos = arrayOf(0)

        var actualShape = "";
        var nextShape = 0;
        var next2nd = 0;
        var next3rd = 0;
        var next4th = 0;
        var shapeDirection = 0;
        var speed: Long = 500;
        var colorCode: Int = 0

        fun newPiece() {
            nextShape = next2nd
            next2nd = (1..7).random()

            clearNextPiece(next2nd,Level.next2Z)
            insertNextPiece(next2nd,Level.next2Z)


            when (nextShape) {
                1 -> {
                    // 0 1 2 3

                    actualShape = "I"
                    colorCode = 2
                    shapeDirection = 1
                    tetrominoXPos = arrayOf(0, 0, 0, 0)
                    tetrominoYPos = arrayOf(3, 4, 5, 6)

                }
                2 -> {
                    // 0 1
                    // 2 3

                    actualShape = "O"
                    colorCode = 3
                    shapeDirection = 1
                    tetrominoXPos = arrayOf(0, 0, 1, 1)
                    tetrominoYPos = arrayOf(4, 5, 4, 5)

                }
                3 -> {
                    // 0 1 2
                    //   3

                    actualShape = "T"
                    colorCode = 4
                    shapeDirection = 1
                    tetrominoXPos = arrayOf(0, 0, 0, 1)
                    tetrominoYPos = arrayOf(3, 4, 5, 4)

                }
                4 -> {
                    // 0 1 2
                    //     3

                    actualShape = "J"
                    colorCode = 5
                    shapeDirection = 1
                    tetrominoXPos = arrayOf(0, 0, 0, 1)
                    tetrominoYPos = arrayOf(3, 4, 5, 5)

                }
                5 -> {

                    // 0 1 2
                    // 3

                    actualShape = "L"
                    shapeDirection = 1
                    colorCode = 6
                    tetrominoXPos = arrayOf(0, 0, 0, 1)
                    tetrominoYPos = arrayOf(3, 4, 5, 3)

                }
                6 -> {

                    //    0 1
                    //  2 3

                    actualShape = "S"
                    shapeDirection = 1
                    colorCode = 7
                    tetrominoXPos = arrayOf(0, 0, 1, 1)
                    tetrominoYPos = arrayOf(4, 5, 3, 4)
                }
                7 -> {

                    //  0 1
                    //    2 3

                    actualShape = "Z"
                    shapeDirection = 1
                    colorCode = 8
                    tetrominoXPos = arrayOf(0, 0, 1, 1)
                    tetrominoYPos = arrayOf(3, 4, 4, 5)

                }
            }
        }

        private fun insertNextPiece(nextShape: Int, level: Array<Array<Int>>) {
            when (nextShape) {
                1 -> { // I
                    level[0][0] = 2
                    level[1][0] = 2
                    level[2][0] = 2
                    level[3][0] = 2
                }
                2 -> { // O
                    level[2][0] = 3
                    level[3][0] = 3
                    level[2][1] = 3
                    level[3][1] = 3
                }
                3 -> { // T
                    level[1][0] = 4
                    level[2][0] = 4
                    level[3][0] = 4
                    level[2][1] = 4
                }
                4 -> { // J
                    level[1][1] = 5
                    level[2][1] = 5
                    level[3][1] = 5
                    level[3][0] = 5
                }
                5 -> { // L
                    level[1][0] = 6
                    level[2][0] = 6
                    level[3][0] = 6
                    level[3][1] = 6
                }
                6 -> { // S
                    level[3][0] = 7
                    level[3][1] = 7
                    level[2][1] = 7
                    level[2][2] = 7
                }
                7 -> { // Z
                    level[3][1] = 8
                    level[3][2] = 8
                    level[2][0] = 8
                    level[2][1] = 8
                }
            }
        }
        private fun clearNextPiece(nextShape: Int, level: Array<Array<Int>>){
            for (i in 0..3) {
                for (j in 0..2) {
                    level[i][j] = 0
                }
            }
        }
    }
}
