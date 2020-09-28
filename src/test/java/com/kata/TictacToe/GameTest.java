package com.kata.TictacToe;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GameTest {

    public static final char PLAYER_X = 'X';
    public static final char PLAYER_O = 'O';
    private Game ticTacToeGame;

    @Before
    public void init() {
        ticTacToeGame = new Game();
    }

    @Test
    public void shouldReturnXOnFirstTurn() {
        ticTacToeGame.playAtPosition(0);
        Assert.assertEquals(PLAYER_X, ticTacToeGame.getPlayer(0));
    }

    @Test
    public void shouldReturnOonSecondTurn(){
        ticTacToeGame.playAtPosition(0);
        ticTacToeGame.playAtPosition(1);
        Assert.assertEquals(PLAYER_O,ticTacToeGame.getPlayer(1));
    }
    @Test
    public void shouldReturnXonThirdTurn() {
        ticTacToeGame.playAtPosition(0);
        ticTacToeGame.playAtPosition(1);
        ticTacToeGame.playAtPosition(2);

        Assert.assertEquals(PLAYER_X, ticTacToeGame.getPlayer(2));
    }

}
