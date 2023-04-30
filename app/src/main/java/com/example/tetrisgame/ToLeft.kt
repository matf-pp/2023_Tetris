package com.example.tetrisgame

class ToLeft {
    companion object {
        fun moveLeft() {
            Tetromino.tetrominoYPos[0] -= 1
            Tetromino.tetrominoYPos[1] -= 1
            Tetromino.tetrominoYPos[2] -= 1
            Tetromino.tetrominoYPos[3] -= 1

            // brisanje stare pozicije
            Level.posMatZ[Tetromino.tetrominoXPos[0]][Tetromino.tetrominoYPos[0] + 1] = 0
            Level.posMatZ[Tetromino.tetrominoXPos[1]][Tetromino.tetrominoYPos[1] + 1] = 0
            Level.posMatZ[Tetromino.tetrominoXPos[2]][Tetromino.tetrominoYPos[2] + 1] = 0
            Level.posMatZ[Tetromino.tetrominoXPos[3]][Tetromino.tetrominoYPos[3] + 1] = 0

            // nova pozicija
            Level.posMatZ[Tetromino.tetrominoXPos[0]][Tetromino.tetrominoYPos[0]] = Tetromino.colorCode
            Level.posMatZ[Tetromino.tetrominoXPos[1]][Tetromino.tetrominoYPos[1]] = Tetromino.colorCode
            Level.posMatZ[Tetromino.tetrominoXPos[2]][Tetromino.tetrominoYPos[2]] = Tetromino.colorCode
            Level.posMatZ[Tetromino.tetrominoXPos[3]][Tetromino.tetrominoYPos[3]] = Tetromino.colorCode

            GhostTetro.setGhost()
        }

        // ako imamo prepreku sa leve strane, ne moze da se pomeri

        fun isMovableLeft(): Boolean {
            when (Tetromino.actualShape) {
                "I" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {
                            //[0] 1  2  3
                            // .  .  .  .
                            // .  .  .  .
                            // .  .  .  .

                            if (Tetromino.tetrominoYPos[0] - 1 < 0 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[0]][Tetromino.tetrominoYPos[0] - 1] > 1
                            )
                                return false
                        }
                        2 -> {
                            // .  0  .  .
                            // .  1  .  .
                            // .  2  .  .
                            // . [3] .  .

                            if (Tetromino.tetrominoYPos[3] - 1 < 0 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[3]][Tetromino.tetrominoYPos[3] - 1] > 1
                            )
                                return false
                        }
                    }
                }

                "J" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {
                            //[0] 1  2
                            // .  . [3]
                            // .  .  .
                            if (Tetromino.tetrominoYPos[0] - 1 < 0 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[0]][Tetromino.tetrominoYPos[0] - 1] > 1  ||
                                Level.posMatZ[Tetromino.tetrominoXPos[3]][Tetromino.tetrominoYPos[3] - 1] > 1
                            )
                                return false
                        }
                        2 -> {
                            // . [0]  .
                            // . [1]  .
                            //[3] 2   .
                            if (Tetromino.tetrominoYPos[3] - 1 < 0 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[0]][Tetromino.tetrominoYPos[0] - 1] > 1  ||
                                Level.posMatZ[Tetromino.tetrominoXPos[3]][Tetromino.tetrominoYPos[3] - 1] > 1  ||
                                Level.posMatZ[Tetromino.tetrominoXPos[1]][Tetromino.tetrominoYPos[1] - 1] > 1
                            )
                                return false
                        }
                        3 -> {
                            //[3] .  .
                            //[2] 1  0
                            // .  .  .
                            if (Tetromino.tetrominoYPos[2] - 1 < 0 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[3]][Tetromino.tetrominoYPos[3] - 1] > 1  ||
                                Level.posMatZ[Tetromino.tetrominoXPos[2]][Tetromino.tetrominoYPos[2] - 1] > 1
                            )
                                return false
                        }
                        4 -> {
                            //[2] 3  .
                            //[1] .  .
                            //[0] .  .
                            if (Tetromino.tetrominoYPos[0] - 1 < 0 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[0]][Tetromino.tetrominoYPos[0] - 1] > 1  ||
                                Level.posMatZ[Tetromino.tetrominoXPos[1]][Tetromino.tetrominoYPos[1] - 1] > 1  ||
                                Level.posMatZ[Tetromino.tetrominoXPos[2]][Tetromino.tetrominoYPos[2] - 1] > 1
                            )
                                return false
                        }
                    }
                }

                "O" -> {
                    // .  0  1  .
                    // . [2] 3  .
                    // .  .  .  .

                    if (Tetromino.tetrominoYPos[2] - 1 < 0 ||
                        Level.posMatZ[Tetromino.tetrominoXPos[2]][Tetromino.tetrominoYPos[2] - 1] > 1
                    )
                        return false
                }
                "T" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {
                            //[0] 1  2
                            // . [3] .
                            // .  .  .
                            if (Tetromino.tetrominoYPos[0] - 1 < 0 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[0]][Tetromino.tetrominoYPos[0] - 1] > 1  ||
                                Level.posMatZ[Tetromino.tetrominoXPos[3]][Tetromino.tetrominoYPos[3] - 1] > 1
                            )
                                return false
                        }
                        2 -> {
                            // . [0]  .
                            //[3] 1  .
                            // . [2]  .
                            if (Tetromino.tetrominoYPos[3] - 1 < 0 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[0]][Tetromino.tetrominoYPos[0] - 1] > 1  ||
                                Level.posMatZ[Tetromino.tetrominoXPos[3]][Tetromino.tetrominoYPos[3] - 1] > 1  ||
                                Level.posMatZ[Tetromino.tetrominoXPos[2]][Tetromino.tetrominoYPos[2] - 1] > 1
                            )
                                return false
                        }
                        3 -> {
                            // . [3]  .
                            //[2] 1  0
                            // .  .  .
                            if (Tetromino.tetrominoYPos[2] - 1 < 0 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[3]][Tetromino.tetrominoYPos[3] - 1] > 1  ||
                                Level.posMatZ[Tetromino.tetrominoXPos[2]][Tetromino.tetrominoYPos[2] - 1] > 1
                            )
                                return false
                        }
                        4 -> {
                            // . [2] .
                            // .  1  3
                            // . [0] .
                            if (Tetromino.tetrominoYPos[0] - 1 < 0 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[2]][Tetromino.tetrominoYPos[2] - 1] > 1  ||
                                Level.posMatZ[Tetromino.tetrominoXPos[0]][Tetromino.tetrominoYPos[0] - 1] > 1
                            )
                                return false
                        }
                    }
                }

                "L" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {
                            //[0] 1  2
                            //[3] .  .
                            // .  .  .
                            if (Tetromino.tetrominoYPos[0] - 1 < 0 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[0]][Tetromino.tetrominoYPos[0] - 1] > 1  ||
                                Level.posMatZ[Tetromino.tetrominoXPos[3]][Tetromino.tetrominoYPos[3] - 1] > 1
                            )
                                return false
                        }
                        2 -> {
                            //[3] 0  .
                            // . [1] .
                            // . [2] .
                            if (Tetromino.tetrominoYPos[3] - 1 < 0 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[2]][Tetromino.tetrominoYPos[2] - 1] > 1  ||
                                Level.posMatZ[Tetromino.tetrominoXPos[3]][Tetromino.tetrominoYPos[3] - 1] > 1  ||
                                Level.posMatZ[Tetromino.tetrominoXPos[1]][Tetromino.tetrominoYPos[1] - 1] > 1
                            )
                                return false
                        }
                        3 -> {
                            // .  . [3]
                            //[2] 1  0
                            // .  .  .
                            if (Tetromino.tetrominoYPos[2] - 1 < 0 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[3]][Tetromino.tetrominoYPos[3] - 1] > 1  ||
                                Level.posMatZ[Tetromino.tetrominoXPos[2]][Tetromino.tetrominoYPos[2] - 1] > 1
                            )
                                return false
                        }
                        4 -> {
                            // [2] .  .
                            // [1] .  .
                            // [0] 3  .
                            if (Tetromino.tetrominoYPos[0] - 1 < 0 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[0]][Tetromino.tetrominoYPos[0] - 1] > 1  ||
                                Level.posMatZ[Tetromino.tetrominoXPos[1]][Tetromino.tetrominoYPos[1] - 1] > 1  ||
                                Level.posMatZ[Tetromino.tetrominoXPos[2]][Tetromino.tetrominoYPos[2] - 1] > 1
                            )
                                return false
                        }
                    }
                }
                "S" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {
                            // . [0] 1
                            //[2] 3  .
                            // .  .  .
                            if (Tetromino.tetrominoYPos[2] - 1 < 0 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[0]][Tetromino.tetrominoYPos[0] - 1] > 1  ||
                                Level.posMatZ[Tetromino.tetrominoXPos[2]][Tetromino.tetrominoYPos[2] - 1] > 1
                            )
                                return false
                        }
                        2 -> {
                            //[2] .  .
                            //[3] 0  .
                            // . [1] .
                            if (Tetromino.tetrominoYPos[2] - 1 < 0 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[2]][Tetromino.tetrominoYPos[2] - 1] > 1  ||
                                Level.posMatZ[Tetromino.tetrominoXPos[3]][Tetromino.tetrominoYPos[3] - 1] > 1  ||
                                Level.posMatZ[Tetromino.tetrominoXPos[1]][Tetromino.tetrominoYPos[1] - 1] > 1
                            )
                                return false
                        }
                    }
                }
                "Z" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {
                            //[0] 1  .
                            // . [2] 3
                            // .  .  .
                            if (Tetromino.tetrominoYPos[0] - 1 < 0 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[0]][Tetromino.tetrominoYPos[0] - 1] > 1  ||
                                Level.posMatZ[Tetromino.tetrominoXPos[2]][Tetromino.tetrominoYPos[2] - 1] > 1
                            )
                                return false
                        }
                        2 -> {
                            // . [0] .
                            //[2] 1  .
                            //[3] .  .
                            if (Tetromino.tetrominoYPos[2] - 1 < 0 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[2]][Tetromino.tetrominoYPos[2] - 1] > 1  ||
                                Level.posMatZ[Tetromino.tetrominoXPos[3]][Tetromino.tetrominoYPos[3] - 1] > 1  ||
                                Level.posMatZ[Tetromino.tetrominoXPos[0]][Tetromino.tetrominoYPos[0] - 1] > 1
                            )
                                return false
                        }
                    }
                }
            }
            return true;
        }
    }
}