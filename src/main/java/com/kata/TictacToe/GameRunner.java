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
        while (true) {
            log.info(turn+"  turn: enter position number (0 to 8) :");
            positionNumber = in.nextInt();
            if(checkForValidation(positionNumber)) {
                if (ticTacToeGame.getWinner() == 'X') {
                    winner = 'X';
                    break;
                }
                if (ticTacToeGame.getWinner() == 'O') {
                    winner = 'O';
                    break;
                }
                if(turn=='X')
                    turn='O';
                else
                    turn='X';
                if(ticTacToeGame.checkMatchIsDraw()){
                    break;
                }
            }
        }
    }

    private static boolean checkForValidation(int positionNumber) {
        return true;
    }

}
