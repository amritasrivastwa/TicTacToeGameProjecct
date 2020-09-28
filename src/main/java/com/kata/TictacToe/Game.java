package com.kata.TictacToe;

public class Game {

    public char getPlayer(int positionNumber) {
        if (positionNumber == 1)
            return 'X';
        else
            return 'O';
    }
}
