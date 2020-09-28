package com.kata.TictacToe;

public class Game {

    public static final char PLAYER_X = 'X';
    public static final char PLAYER_O = 'O';
    char previousPlayer;
    static char[] board = new char[8];

    public char getPlayer(int postionNumber) {
        return board[postionNumber];
    }

    public void playAtPosition(int positionNumber) {
        char currentPlayer = getCurrentPlayer();
        board[positionNumber] = currentPlayer;
        previousPlayer = currentPlayer;
    }

    private char getCurrentPlayer() {
        return previousPlayer == PLAYER_X ? PLAYER_O : PLAYER_X;
    }

    public char getWinner() {
        if (getPlayer(0) == PLAYER_X && getPlayer(3) == PLAYER_X && getPlayer(6) == PLAYER_X) {
            return PLAYER_X;
        }
        else if (getPlayer(0) == PLAYER_O && getPlayer(3) == PLAYER_O && getPlayer(6) == PLAYER_O) {
            return PLAYER_O;
        }
        return 0;

    }
}


