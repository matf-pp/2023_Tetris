package com.example.tetrisgame

class Rotate {
    companion object {
        fun doRotate() {
            when (Tetromino.actualShape) {
                "I" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {

                            // rotacija I -> _

                            Level.removeOldPosition()
                            Tetromino.tetrominoYPos[0] += 1
                            Tetromino.tetrominoXPos[1] += 1
                            Tetromino.tetrominoXPos[2] += 2
                            Tetromino.tetrominoYPos[2] -= 1
                            Tetromino.tetrominoXPos[3] += 3
                            Tetromino.tetrominoYPos[3] -= 2
                            Level.insertNewPosition()
                            Tetromino.shapeDirection = 2
                        }
                        2 -> {

                            // rotacija unazad

                            Level.removeOldPosition()
                            Tetromino.tetrominoYPos[0] -= 1
                            Tetromino.tetrominoXPos[1] -= 1
                            Tetromino.tetrominoXPos[2] -= 2
                            Tetromino.tetrominoYPos[2] += 1
                            Tetromino.tetrominoXPos[3] -= 3
                            Tetromino.tetrominoYPos[3] += 2
                            Level.insertNewPosition()
                            Tetromino.shapeDirection = 1
                        }
                    }
                }
                "O" -> {
                    // isto
                }
                "T" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {

                            // T -> -|

                            Level.removeOldPosition()
                            Tetromino.tetrominoYPos[0] += 1
                            Tetromino.tetrominoXPos[1] += 1
                            Tetromino.tetrominoXPos[2] += 2
                            Tetromino.tetrominoYPos[2] -= 1
                            Tetromino.tetrominoYPos[3] -= 1
                            Level.insertNewPosition()
                            Tetromino.shapeDirection = 2
                        }
                        2 -> {
                            // -| -> (obrnuto T)

                            Level.removeOldPosition()
                            Tetromino.tetrominoXPos[0] += 1
                            Tetromino.tetrominoYPos[0] += 1
                            Tetromino.tetrominoXPos[2] -= 1
                            Tetromino.tetrominoYPos[2] -= 1
                            Tetromino.tetrominoXPos[3] -= 1
                            Tetromino.tetrominoYPos[3] += 1
                            Level.insertNewPosition()
                            Tetromino.shapeDirection = 3
                        }
                        3 -> {

                            // (obrnuto T) -> |-

                            Level.removeOldPosition()
                            Tetromino.tetrominoXPos[0] += 1
                            Tetromino.tetrominoYPos[0] -= 1
                            Tetromino.tetrominoXPos[2] -= 1
                            Tetromino.tetrominoYPos[2] += 1
                            Tetromino.tetrominoXPos[3] += 1
                            Tetromino.tetrominoYPos[3] += 1
                            Level.insertNewPosition()
                            Tetromino.shapeDirection = 4
                        }
                        4 -> {

                            // |- -> T

                            Level.removeOldPosition()
                            Tetromino.tetrominoXPos[0] -= 2
                            Tetromino.tetrominoYPos[0] -= 1
                            Tetromino.tetrominoXPos[1] -= 1
                            Tetromino.tetrominoYPos[2] += 1
                            Tetromino.tetrominoYPos[3] -= 1
                            Level.insertNewPosition()
                            Tetromino.shapeDirection = 1
                        }
                    }
                }
                "J" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {

                            // --, -> _|

                            Level.removeOldPosition()
                            Tetromino.tetrominoYPos[0] += 1
                            Tetromino.tetrominoXPos[1] += 1
                            Tetromino.tetrominoXPos[2] += 2
                            Tetromino.tetrominoYPos[2] -= 1
                            Tetromino.tetrominoXPos[3] += 1
                            Tetromino.tetrominoYPos[3] -= 2
                            Level.insertNewPosition()
                            Tetromino.shapeDirection = 2
                        }
                        2 -> {

                            // _| -> '--

                            Level.removeOldPosition()
                            Tetromino.tetrominoXPos[0] += 1
                            Tetromino.tetrominoYPos[0] += 1
                            Tetromino.tetrominoXPos[2] -= 1
                            Tetromino.tetrominoYPos[2] -= 1
                            Tetromino.tetrominoXPos[3] -= 2
                            Tetromino.tetrominoYPos[3] += 0
                            Level.insertNewPosition()
                            Tetromino.shapeDirection = 3
                        }
                        3 -> {

                            // '-- -> Г

                            Level.removeOldPosition()
                            Tetromino.tetrominoXPos[0] += 1
                            Tetromino.tetrominoYPos[0] -= 2
                            Tetromino.tetrominoYPos[1] -= 1
                            Tetromino.tetrominoXPos[2] -= 1
                            Tetromino.tetrominoYPos[3] += 1
                            Level.insertNewPosition()
                            Tetromino.shapeDirection = 4
                        }
                        4 -> {

                            // Г -> --,

                            Level.removeOldPosition()
                            Tetromino.tetrominoXPos[0] -= 2
                            Tetromino.tetrominoXPos[1] -= 1
                            Tetromino.tetrominoYPos[1] += 1
                            Tetromino.tetrominoYPos[2] += 2
                            Tetromino.tetrominoXPos[3] += 1
                            Tetromino.tetrominoYPos[3] += 1
                            Level.insertNewPosition()
                            Tetromino.shapeDirection = 1
                        }
                    }
                }
                "L" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {

                            // ,-- -> (Cirilicno G refleksija preko y ose)

                            Level.removeOldPosition()
                            Tetromino.tetrominoYPos[0] += 1
                            Tetromino.tetrominoXPos[1] += 1
                            Tetromino.tetrominoXPos[2] += 2
                            Tetromino.tetrominoYPos[2] -= 1
                            Tetromino.tetrominoXPos[3] -= 1
                            Level.insertNewPosition()
                            Tetromino.shapeDirection = 2
                        }
                        2 -> {

                            // (Cirilicno G refleksija preko y ose) -> --'

                            Level.removeOldPosition()
                            Tetromino.tetrominoXPos[0] += 1
                            Tetromino.tetrominoYPos[0] += 1
                            Tetromino.tetrominoXPos[2] -= 1
                            Tetromino.tetrominoYPos[2] -= 1
                            Tetromino.tetrominoYPos[3] += 2
                            Level.insertNewPosition()
                            Tetromino.shapeDirection = 3
                        }
                        3 -> {

                            // --' -> L

                            Level.removeOldPosition()
                            Tetromino.tetrominoXPos[0] += 1
                            Tetromino.tetrominoYPos[0] -= 2
                            Tetromino.tetrominoYPos[1] -= 1
                            Tetromino.tetrominoXPos[2] -= 1
                            Tetromino.tetrominoXPos[3] += 2
                            Tetromino.tetrominoYPos[3] -= 1
                            Level.insertNewPosition()
                            Tetromino.shapeDirection = 4
                        }
                        4 -> {

                            // L -> ,--

                            Level.removeOldPosition()
                            Tetromino.tetrominoXPos[0] -= 2
                            Tetromino.tetrominoXPos[1] -= 1
                            Tetromino.tetrominoYPos[1] += 1
                            Tetromino.tetrominoYPos[2] += 2
                            Tetromino.tetrominoXPos[3] -= 1
                            Tetromino.tetrominoYPos[3] -= 1
                            Level.insertNewPosition()
                            Tetromino.shapeDirection = 1
                        }
                    }
                }
                "S" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {
                            //    1  1          1
                            // 1  1       ->    1  1
                            //                     1

                            Level.removeOldPosition()
                            Tetromino.tetrominoXPos[0] += 1
                            Tetromino.tetrominoXPos[1] += 2
                            Tetromino.tetrominoYPos[1] -= 1
                            Tetromino.tetrominoXPos[2] -= 1
                            Tetromino.tetrominoYPos[3] -= 1
                            Level.insertNewPosition()
                            Tetromino.shapeDirection = 2
                        }
                        2 -> {
                            // 1                  1  1
                            // 1  1      ->    1  1
                            //    1

                            Level.removeOldPosition()
                            Tetromino.tetrominoXPos[0] -= 1
                            Tetromino.tetrominoXPos[1] -= 2
                            Tetromino.tetrominoYPos[1] += 1
                            Tetromino.tetrominoXPos[2] += 1
                            Tetromino.tetrominoYPos[3] += 1
                            Level.insertNewPosition()
                            Tetromino.shapeDirection = 1
                        }
                    }
                }
                "Z" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {
                            // 1  1                1
                            //    1  1    ->    1  1
                            //                  1

                            Level.removeOldPosition()
                            Tetromino.tetrominoYPos[0] += 1
                            Tetromino.tetrominoXPos[1] += 1
                            Tetromino.tetrominoYPos[2] -= 1
                            Tetromino.tetrominoXPos[3] += 1
                            Tetromino.tetrominoYPos[3] -= 2
                            Level.insertNewPosition()
                            Tetromino.shapeDirection = 2
                        }
                        2 -> {
                            //    1           1  1
                            // 1  1    ->        1  1
                            // 1

                            Level.removeOldPosition()
                            Tetromino.tetrominoYPos[0] -= 1
                            Tetromino.tetrominoXPos[1] -= 1
                            Tetromino.tetrominoYPos[2] += 1
                            Tetromino.tetrominoXPos[3] -= 1
                            Tetromino.tetrominoYPos[3] += 2
                            Level.insertNewPosition()
                            Tetromino.shapeDirection = 1
                        }
                    }
                }
            }
            GhostTetro.setGhost()
        }


        fun isRotable(): Boolean {
            when (Tetromino.actualShape) {
                "I" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {
                            // provera za I za donji bound

                            if (
                                Tetromino.tetrominoXPos[1] + 1 > 21 ||
                                Tetromino.tetrominoXPos[2] + 2 > 21 ||
                                Tetromino.tetrominoXPos[3] + 3 > 21 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[1] + 1][Tetromino.tetrominoYPos[1]] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[2] + 2][Tetromino.tetrominoYPos[2] - 1] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[3] + 3][Tetromino.tetrominoYPos[3] - 2] > 1
                            )
                                return false
                        }
                        2 -> {
                                // provera za levi i desni zid
                            if (
                                Tetromino.tetrominoYPos[0] - 1 < 0 ||
                                Tetromino.tetrominoYPos[2] + 1 > 9 ||
                                Tetromino.tetrominoYPos[3] + 2 > 9 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[0]][Tetromino.tetrominoYPos[0] - 1] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[2] - 2][Tetromino.tetrominoYPos[2] + 1] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[3] - 3][Tetromino.tetrominoYPos[3] + 2] > 1
                            )
                                return false
                        }
                    }
                }
                "O" -> {
                    // nema rotacije
                }
                "T" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {
                            // donji bound
                            if (
                                Tetromino.tetrominoXPos[2] + 2 > 21 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[2] + 2][Tetromino.tetrominoYPos[2] - 1] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[3]][Tetromino.tetrominoYPos[3] - 1] > 1
                            )
                                return false

                        }
                        2 -> {
                            // desni zid
                            if (
                                Tetromino.tetrominoYPos[0] + 1 > 9 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[0] + 1][Tetromino.tetrominoYPos[0] + 1] > 1
                            ) return false
                        }
                        3 -> {
                           // provera za obrnuto T, za pod da ne zapne za donji bound jer ce imati jednu vise ispod

                            if (
                                Tetromino.tetrominoXPos[0] + 1 > 21 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[0] + 1][Tetromino.tetrominoYPos[0] - 1] > 1

                            ) return false


                        }
                        4 -> {
                            // levi zid

                            if (
                                Tetromino.tetrominoYPos[0] - 1 < 0 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[0] - 2][Tetromino.tetrominoYPos[0] - 1] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[2]][Tetromino.tetrominoYPos[2] + 1] > 1
                            ) return false
                        }
                    }
                }
                "J" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {

                            if (
                                Tetromino.tetrominoXPos[3] + 1 > 21 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[1] + 1][Tetromino.tetrominoYPos[1]] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[2] + 2][Tetromino.tetrominoYPos[2] - 1] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[3] + 1][Tetromino.tetrominoYPos[3] - 2] > 1
                            ) return false
                        }
                        2 -> {
                            // desni zid
                            if (
                                Tetromino.tetrominoYPos[0] + 1 > 9 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[0] + 1][Tetromino.tetrominoYPos[0] + 1] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[2] - 1][Tetromino.tetrominoYPos[2] - 1] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[3] - 2][Tetromino.tetrominoYPos[3] + 0] > 1
                            ) return false
                        }
                        3 -> {
                            if (
                                Tetromino.tetrominoXPos[0] + 1 > 21 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[0] + 1][Tetromino.tetrominoYPos[0] - 2] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[3]][Tetromino.tetrominoYPos[3] + 1] > 1
                            ) return false
                        }
                        4 -> {
                                // densi zid
                            if (
                                Tetromino.tetrominoYPos[2] + 2 > 9 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[2]][Tetromino.tetrominoYPos[2] + 2] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[3] + 1][Tetromino.tetrominoYPos[3] + 1] > 1
                            ) return false
                        }
                    }
                }
                "L" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {
                            if (
                                Tetromino.tetrominoXPos[2] + 2 > 21 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[1] + 1][Tetromino.tetrominoYPos[1]] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[2] + 2][Tetromino.tetrominoYPos[2] - 1] > 1
                            ) return false
                        }
                        2 -> {
                            // desni zid
                            if (
                                Tetromino.tetrominoYPos[0] + 1 > 9 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[0] + 1][Tetromino.tetrominoYPos[0] + 1] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[2] - 1][Tetromino.tetrominoYPos[2] - 1] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[3]][Tetromino.tetrominoYPos[3] + 2] > 1
                            ) return false
                        }
                        3 -> {
                            if (
                                Tetromino.tetrominoXPos[0] + 1 > 21 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[0] + 1][Tetromino.tetrominoYPos[0] - 2] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[2] - 1][Tetromino.tetrominoYPos[2]] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[3] + 2][Tetromino.tetrominoYPos[3] - 1] > 1
                            ) return false
                        }
                        4 -> {
                            // desni zid
                            if (
                                Tetromino.tetrominoYPos[2] + 2 > 9 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[1] - 1][Tetromino.tetrominoYPos[1] + 1] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[2]][Tetromino.tetrominoYPos[2] + 2] > 1
                            ) return false
                        }
                    }
                }
                "S" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {
                            if (
                                Tetromino.tetrominoXPos[1] + 2 > 21 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[1] + 2][Tetromino.tetrominoYPos[1] - 1] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[2] - 1][Tetromino.tetrominoYPos[2]] > 1
                            ) return false

                        }
                        2 -> {
                            // desni zid

                            if (
                                Tetromino.tetrominoYPos[1] + 1 > 9 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[0] - 1][Tetromino.tetrominoYPos[0]] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[1] - 2][Tetromino.tetrominoYPos[1] + 1] > 1
                            ) return false
                        }
                    }
                }
                "Z" -> {
                    when (Tetromino.shapeDirection) {
                        1 -> {
                            if (
                                Tetromino.tetrominoXPos[3] + 1 > 21 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[2]][Tetromino.tetrominoYPos[2] - 1] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[3] + 1][Tetromino.tetrominoYPos[3] - 2] > 1
                            ) return false
                        }
                        2 -> {
                            // desni zid

                            if (
                                Tetromino.tetrominoYPos[3] + 2 > 9 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[0]][Tetromino.tetrominoYPos[0] - 1] > 1 ||
                                Level.posMatZ[Tetromino.tetrominoXPos[3] - 1][Tetromino.tetrominoYPos[3] + 2] > 1
                            ) return false
                        }
                    }
                }
            }
            return true
        }
    }
}