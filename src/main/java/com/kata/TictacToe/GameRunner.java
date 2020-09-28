package com.kata.TictacToe;

import java.util.logging.Logger;

public class GameRunner {
    static Game ticTacToeGame;
    static Logger log = Logger.getLogger(GameRunner.class.getName());

    public static void main(String[] args){
        log.info("Welcome to 2 Player Tic Tac Toe.");
        log.info("--------------------------------");
        ticTacToeGame = new Game();
        ticTacToeGame.initializeBoard();
        ticTacToeGame.printBoard();
    }

}
