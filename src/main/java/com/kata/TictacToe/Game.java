package com.kata.TictacToe;

public class Game {

    public static final char PLAYER_X = 'X';
    public static final char PLAYER_O = 'O';
    public static final int SECOND_POSITION = 2;
    public static final int FIFTH_POSITION = 5;
    public static final int EIGTH_POSITION = 8;
    public static final int FIRST_POSITION = 1;
    public static final int FOURTH_POSITION = 4;
    public static final int SEVENTH_POSITION = 7;
    public static final int ZERO_POSITION = 0;
    public static final int THIRD_POSITION = 3;
    public static final int SIXTH_POSITION = 6;

    char previousPlayer;
    char[] board = new char[9];

    public char getPlayer(int positionNumber) {
        return board[positionNumber];
    }

    public void initializeBoard() {
        for (int i = 0; i < 9; i++) {
            board[i] = (char) i;
        }
    }
    public boolean userInputValidation(int positionNumber) {
        if (positionNumber < 0 || positionNumber > 8) {
            System.out.println("Invalid input re-enter slot number....");
            return false;
        } else
            return true;
    }
    public boolean checkPositionIsFree(int positionNumber) {
        if (board[positionNumber] == positionNumber) {
            playAtPosition(positionNumber);
            return true;
        } else {
            System.out.println("Slot already taken; re-enter slot number: ");
            return false;
        }
    }

    public void playAtPosition(int positionNumber) {
        if (userInputValidation(positionNumber)) {
            char currentPlayer = getCurrentPlayer();
            board[positionNumber] = currentPlayer;
            previousPlayer = currentPlayer;
        }
    }
    private char getCurrentPlayer() {
        return previousPlayer == PLAYER_X ? PLAYER_O : PLAYER_X;
    }

    public char getWinner() {
        char winner = 0;
        if (isAnyColumnFilledByPlayerX() || isAnyRowFilledByPlayerX() || isAnyDiagonalFilledByPlayerX()) {
            winner = PLAYER_X;
        }
        if (isAnyColumnFilledByPlayerO() || isAnyRowFilledByPlayerO() || isAnyDiagonalFilledByPlayerO()) {
            winner = PLAYER_O;
        }
        return winner;
    }

    private boolean isAnyColumnFilledByPlayerX() {
        return isPlayerXonGivenPosition(SECOND_POSITION) && isPlayerXonGivenPosition(FIFTH_POSITION) && isPlayerXonGivenPosition(EIGTH_POSITION)
                || isPlayerXonGivenPosition(FIRST_POSITION) && isPlayerXonGivenPosition(FOURTH_POSITION) && isPlayerXonGivenPosition(SEVENTH_POSITION)
                || isPlayerXonGivenPosition(ZERO_POSITION) && isPlayerXonGivenPosition(THIRD_POSITION) && isPlayerXonGivenPosition(SIXTH_POSITION);
    }

    private boolean isAnyRowFilledByPlayerX() {
        return isPlayerXonGivenPosition(ZERO_POSITION) && isPlayerXonGivenPosition(FIRST_POSITION) && isPlayerXonGivenPosition(SECOND_POSITION)
                || isPlayerXonGivenPosition(THIRD_POSITION) && isPlayerXonGivenPosition(FOURTH_POSITION) && isPlayerXonGivenPosition(FIFTH_POSITION)
                || isPlayerXonGivenPosition(SIXTH_POSITION) && isPlayerXonGivenPosition(SEVENTH_POSITION) && isPlayerXonGivenPosition(EIGTH_POSITION);
    }

    private boolean isAnyDiagonalFilledByPlayerX() {
        return isPlayerXonGivenPosition(ZERO_POSITION) && isPlayerXonGivenPosition(FOURTH_POSITION) && isPlayerXonGivenPosition(EIGTH_POSITION)
                || isPlayerXonGivenPosition(SECOND_POSITION) && isPlayerXonGivenPosition(FOURTH_POSITION) && isPlayerXonGivenPosition(SIXTH_POSITION);
    }

    private boolean isPlayerXonGivenPosition(int position) {
        return getPlayer(position) == PLAYER_X;
    }

    private boolean isAnyColumnFilledByPlayerO() {
        return isPlayerOonGivenPosition(SECOND_POSITION) && isPlayerOonGivenPosition(FIFTH_POSITION) && isPlayerOonGivenPosition(EIGTH_POSITION)
                || isPlayerOonGivenPosition(FIRST_POSITION) && isPlayerOonGivenPosition(FOURTH_POSITION) && isPlayerOonGivenPosition(SEVENTH_POSITION)
                || isPlayerOonGivenPosition(ZERO_POSITION) && isPlayerOonGivenPosition(THIRD_POSITION) && isPlayerOonGivenPosition(SIXTH_POSITION);
    }

    private boolean isAnyRowFilledByPlayerO() {
        return isPlayerOonGivenPosition(ZERO_POSITION) && isPlayerOonGivenPosition(FIRST_POSITION) && isPlayerOonGivenPosition(SECOND_POSITION)
                || isPlayerOonGivenPosition(THIRD_POSITION) && isPlayerOonGivenPosition(FOURTH_POSITION) && isPlayerOonGivenPosition(FIFTH_POSITION)
                || isPlayerOonGivenPosition(SIXTH_POSITION) && isPlayerOonGivenPosition(SEVENTH_POSITION) && isPlayerOonGivenPosition(EIGTH_POSITION);
    }

    private boolean isAnyDiagonalFilledByPlayerO() {
        return isPlayerOonGivenPosition(ZERO_POSITION) && isPlayerOonGivenPosition(FOURTH_POSITION) && isPlayerOonGivenPosition(EIGTH_POSITION)
                || isPlayerOonGivenPosition(SECOND_POSITION) && isPlayerOonGivenPosition(FOURTH_POSITION) && isPlayerOonGivenPosition(SIXTH_POSITION);
    }

    private boolean isPlayerOonGivenPosition(int position) {
        return getPlayer(position) == PLAYER_O;
    }

    public void printBoard() {
        System.out.println("/---|---|---\\");
        System.out.println("|  0 | 1 | 2 |");
        System.out.println("|-----------|");
        System.out.println("| 3 | 4 | 5 |");
        System.out.println("|-----------|");
        System.out.println("| 6 | 7 | 8 |");
        System.out.println("/---|---|---\\");

    }

    public boolean checkMatchIsDraw() {
        return true;
    }
}