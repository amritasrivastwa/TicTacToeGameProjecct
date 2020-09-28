package com.kata.TictacToe;

import java.util.Scanner;
import java.util.logging.Logger;

public class GameRunner {
    static Game ticTacToeGame;
    static Logger log = Logger.getLogger(GameRunner.class.getName());
    public static char turn= 'X';

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int positionNumber;
        log.info("Welcome to 2 Player Tic Tac Toe.");
        log.info("--------------------------------");
        ticTacToeGame = new Game();
        ticTacToeGame.initializeBoard();
        ticTacToeGame.printBoard();
        char winner = 0;

    }

}
