package com.kata.TictacToe;

public class Game {

    public static final char PLAYER_X = 'X';
    public static final char PLAYER_O = 'O';
    char previousPlayer;
    static char[] board = new char[9];

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
        char winner = 0;
        if (isAnyColumnFilledByPlayerX() || isAnyRowFilledByPlayerX() ){
            winner = PLAYER_X;
        }
        if (isAnyColumnFilledByPlayerO()) {
            winner = PLAYER_O;
        }
        return winner;
    }

    private boolean isAnyColumnFilledByPlayerX() {
        return isPlayerXonGivenPosition(2) && isPlayerXonGivenPosition(5) && isPlayerXonGivenPosition(8)
                || isPlayerXonGivenPosition(1) && isPlayerXonGivenPosition(4) && isPlayerXonGivenPosition(7)
                || isPlayerXonGivenPosition(0) && isPlayerXonGivenPosition(3) && isPlayerXonGivenPosition(6);
    }
    private boolean isAnyRowFilledByPlayerX() {
        return isPlayerXonGivenPosition(0) && isPlayerXonGivenPosition(1) && isPlayerXonGivenPosition(2)
                || isPlayerXonGivenPosition(3) && isPlayerXonGivenPosition(4) && isPlayerXonGivenPosition(5)
                || isPlayerXonGivenPosition(6) && isPlayerXonGivenPosition(7) && isPlayerXonGivenPosition(8);
    }

    private boolean isPlayerXonGivenPosition(int position) {
        return getPlayer(position) == PLAYER_X;
    }

    private boolean isAnyColumnFilledByPlayerO() {
        return isPlayerOonGivenPosition(2) && isPlayerOonGivenPosition(5) && isPlayerOonGivenPosition(8)
                || isPlayerOonGivenPosition(1) && isPlayerOonGivenPosition(4) && isPlayerOonGivenPosition(7)
                || isPlayerOonGivenPosition(0) && isPlayerOonGivenPosition(3) && isPlayerOonGivenPosition(6);
    }

    private boolean isPlayerOonGivenPosition(int position) {
        return getPlayer(position) == PLAYER_O;
    }

}


