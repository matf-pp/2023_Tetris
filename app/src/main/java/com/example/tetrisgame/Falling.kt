package com.example.tetrisgame

class Falling {
    companion object {

        fun landing(iX: Int): Boolean {

            if (Tetromino.tetrominoXPos[0] + iX > 21 ||
                Tetromino.tetrominoXPos[1] + iX > 21 ||
                Tetromino.tetrominoXPos[2] + iX > 21 ||
                Tetromino.tetrominoXPos[3] + iX > 21
            )
                return true

            when (Tetromino.actualShape) {
                "I" -> {
                    when (Tetromino.shapeDirection) {

                        1 -> {
                            // 1  1  1  1

                            if (Tetromino.tetrominoXPos[0] == 21 || Tetromino.tetrominoXPos[1] == 21 ||
                                Tetromino.tetrominoXPos[2] == 21 || Tetromino.tetrominoXPos[3] == 21 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[0] + iX][Tetromino.tetrominoYPos[0]] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[1] + iX][Tetromino.tetrominoYPos[1]] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[2] + iX][Tetromino.tetrominoYPos[2]] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[3] + iX][Tetromino.tetrominoYPos[3]] > 1
                            )
                                return true
                        }

                        2 -> {
                            //   1
                            //   1
                            //   1
                            //   1

                            if (Tetromino.tetrominoXPos[3] == 21 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[3] + iX][Tetromino.tetrominoYPos[3]] > 1
                            )
                                return true
                        }
                    }
                }
                "O" -> {
                    //  1  1
                    //  1  1

                    if (
                        Tetromino.tetrominoXPos[2] == 21 || Tetromino.tetrominoXPos[3] == 21 ||
                        Level.posMatZ[Tetromino.tetrominoXPos[2] + iX][Tetromino.tetrominoYPos[2]] > 1 ||
                        Level.posMatZ[Tetromino.tetrominoXPos[3] + iX][Tetromino.tetrominoYPos[3]] > 1
                    )
                        return true
                }
                "T" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {
                            // 1  1  1
                            //    1
                            if (Tetromino.tetrominoXPos[3] == 21 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[0] + iX][Tetromino.tetrominoYPos[0]] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[2] + iX][Tetromino.tetrominoYPos[2]] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[3] + iX][Tetromino.tetrominoYPos[3]] > 1
                            )
                                return true
                        }
                        2 -> {
                            //    1
                            // 1  1
                            //    1
                            if (Tetromino.tetrominoXPos[2] == 21 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[2] + iX][Tetromino.tetrominoYPos[2]] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[3] + iX][Tetromino.tetrominoYPos[3]] > 1
                            )
                                return true
                        }
                        3 -> {
                            //    1
                            // 1  1  1
                            if (Tetromino.tetrominoXPos[2] == 21 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[2] + iX][Tetromino.tetrominoYPos[2]] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[1] + iX][Tetromino.tetrominoYPos[1]] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[0] + iX][Tetromino.tetrominoYPos[0]] > 1
                            )
                                return true
                        }
                        4 -> {
                            //   1
                            //   1  1
                            //   1
                            if (Tetromino.tetrominoXPos[0] == 21 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[3] + iX][Tetromino.tetrominoYPos[3]] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[0] + iX][Tetromino.tetrominoYPos[0]] > 1
                            )
                                return true
                        }
                    }
                }
                "J" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {
                            // 1  1  1
                            //       1
                            if (Tetromino.tetrominoXPos[3] == 21 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[0] + iX][Tetromino.tetrominoYPos[0]] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[1] + iX][Tetromino.tetrominoYPos[1]] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[3] + iX][Tetromino.tetrominoYPos[3]] > 1
                            )
                                return true
                        }
                        2 -> {
                            //    1
                            //    1
                            // 1  1
                            if (Tetromino.tetrominoXPos[2] == 21 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[2] + iX][Tetromino.tetrominoYPos[2]] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[3] + iX][Tetromino.tetrominoYPos[3]] > 1
                            )
                                return true
                        }
                        3 -> {
                            // 1
                            // 1  1  1
                            if (Tetromino.tetrominoXPos[2] == 21 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[2] + iX][Tetromino.tetrominoYPos[2]] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[1] + iX][Tetromino.tetrominoYPos[1]] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[0] + iX][Tetromino.tetrominoYPos[0]] > 1
                            )
                                return true
                        }
                        4 -> {
                            // 1  1
                            // 1
                            // 1
                            if (Tetromino.tetrominoXPos[0] == 21 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[3] + iX][Tetromino.tetrominoYPos[3]] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[0] + iX][Tetromino.tetrominoYPos[0]] > 1
                            )
                                return true
                        }
                    }
                }
                "L" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {
                            // 1  1  1
                            // 1
                            if (Tetromino.tetrominoXPos[3] == 21 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[2] + iX][Tetromino.tetrominoYPos[2]] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[1] + iX][Tetromino.tetrominoYPos[1]] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[3] + iX][Tetromino.tetrominoYPos[3]] > 1
                            )
                                return true
                        }
                        2 -> {
                            // 1  1
                            //    1
                            //    1
                            if (Tetromino.tetrominoXPos[2] == 21 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[2] + iX][Tetromino.tetrominoYPos[2]] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[3] + iX][Tetromino.tetrominoYPos[3]] > 1
                            )
                                return true
                        }
                        3 -> {
                            //       1
                            // 1  1  1

                            if (Tetromino.tetrominoXPos[2] == 21 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[2] + iX][Tetromino.tetrominoYPos[2]] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[1] + iX][Tetromino.tetrominoYPos[1]] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[0] + iX][Tetromino.tetrominoYPos[0]] > 1
                            )
                                return true
                        }
                        4 -> {
                            // 1
                            // 1
                            // 1  1
                            if (Tetromino.tetrominoXPos[0] == 21 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[3] + iX][Tetromino.tetrominoYPos[3]] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[0] + iX][Tetromino.tetrominoYPos[0]] > 1
                            )
                                return true
                        }
                    }
                }
                "S" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {
                            //    1  1
                            // 1  1

                            if (Tetromino.tetrominoXPos[3] == 21 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[2] + iX][Tetromino.tetrominoYPos[2]] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[1] + iX][Tetromino.tetrominoYPos[1]] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[3] + iX][Tetromino.tetrominoYPos[3]] > 1
                            )
                                return true
                        }
                        2 -> {
                            // 1
                            // 1  1
                            //    1
                            if (Tetromino.tetrominoXPos[1] == 21 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[1] + iX][Tetromino.tetrominoYPos[1]] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[3] + iX][Tetromino.tetrominoYPos[3]] > 1
                            )
                                return true
                        }
                    }
                }
                "Z" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {
                            // 1  1
                            //    1  1
                            if (Tetromino.tetrominoXPos[3] == 21 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[2] + iX][Tetromino.tetrominoYPos[2]] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[0] + iX][Tetromino.tetrominoYPos[0]] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[3] + iX][Tetromino.tetrominoYPos[3]] > 1
                            )
                                return true
                        }
                        2 -> {
                            //    1
                            // 1  1
                            // 1
                            if (Tetromino.tetrominoXPos[3] == 21 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[1] + iX][Tetromino.tetrominoYPos[1]] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[3] + iX][Tetromino.tetrominoYPos[3]] > 1
                            )
                                return true
                        }
                    }
                }
            }
            return false
        }
        fun falling() {

            Tetromino.tetrominoXPos[0] += 1
            Tetromino.tetrominoXPos[1] += 1
            Tetromino.tetrominoXPos[2] += 1
            Tetromino.tetrominoXPos[3] += 1

            Level.posMatZ[Tetromino.tetrominoXPos[0] - 1][Tetromino.tetrominoYPos[0]] = 0
            Level.posMatZ[Tetromino.tetrominoXPos[1] - 1][Tetromino.tetrominoYPos[1]] = 0
            Level.posMatZ[Tetromino.tetrominoXPos[2] - 1][Tetromino.tetrominoYPos[2]] = 0
            Level.posMatZ[Tetromino.tetrominoXPos[3] - 1][Tetromino.tetrominoYPos[3]] = 0

            Level.posMatZ[Tetromino.tetrominoXPos[0]][Tetromino.tetrominoYPos[0]] = Tetromino.colorCode
            Level.posMatZ[Tetromino.tetrominoXPos[1]][Tetromino.tetrominoYPos[1]] = Tetromino.colorCode
            Level.posMatZ[Tetromino.tetrominoXPos[2]][Tetromino.tetrominoYPos[2]] = Tetromino.colorCode
            Level.posMatZ[Tetromino.tetrominoXPos[3]][Tetromino.tetrominoYPos[3]] = Tetromino.colorCode

            GhostTetro.setGhost()
        }
    }
}