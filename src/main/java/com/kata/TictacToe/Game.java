package com.kata.TictacToe;

public class Game {

    public static final char PLAYER_X = 'X';
    public static final char PLAYER_O = 'O';
    public char getPlayer(int positionNumber) {
        if (positionNumber == 1)
            return PLAYER_X;
        else
            return PLAYER_O;
    }
}
