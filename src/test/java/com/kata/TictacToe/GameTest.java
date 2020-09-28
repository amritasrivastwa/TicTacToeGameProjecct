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
    public void shouldReturnOonSecondTurn() {
        ticTacToeGame.playAtPosition(0);
        ticTacToeGame.playAtPosition(1);
        Assert.assertEquals(PLAYER_O, ticTacToeGame.getPlayer(1));
    }

    @Test
    public void shouldReturnXonThirdTurn() {
        ticTacToeGame.playAtPosition(0);
        ticTacToeGame.playAtPosition(1);
        ticTacToeGame.playAtPosition(2);

        Assert.assertEquals(PLAYER_X, ticTacToeGame.getPlayer(2));
    }

    @Test
    public void shouldDetermineWinnerXAfterFillingFirstColumn() {
        ticTacToeGame.playAtPosition(0);
        ticTacToeGame.playAtPosition(1);
        ticTacToeGame.playAtPosition(3);
        ticTacToeGame.playAtPosition(2);
        ticTacToeGame.playAtPosition(6);

        Assert.assertEquals(PLAYER_X, ticTacToeGame.getWinner());
    }

    @Test
    public void shouldDetermineWinnerOAfterFillingFirstColumn() {
        ticTacToeGame.playAtPosition(1);
        ticTacToeGame.playAtPosition(0);
        ticTacToeGame.playAtPosition(2);
        ticTacToeGame.playAtPosition(3);
        ticTacToeGame.playAtPosition(4);
        ticTacToeGame.playAtPosition(6);

        Assert.assertEquals(PLAYER_O, ticTacToeGame.getWinner());
    }

    @Test
    public void shouldDetermineWinnerXAfterFillingSecondColumn() {
        ticTacToeGame.playAtPosition(1);
        ticTacToeGame.playAtPosition(0);
        ticTacToeGame.playAtPosition(4);
        ticTacToeGame.playAtPosition(6);
        ticTacToeGame.playAtPosition(7);

        Assert.assertEquals(PLAYER_X, ticTacToeGame.getWinner());
    }

    @Test
    public void shouldDetermineWinnerOAfterFillingSecondColumn() {
        ticTacToeGame.playAtPosition(0);
        ticTacToeGame.playAtPosition(1);
        ticTacToeGame.playAtPosition(2);
        ticTacToeGame.playAtPosition(4);
        ticTacToeGame.playAtPosition(3);
        ticTacToeGame.playAtPosition(7);

        Assert.assertEquals(PLAYER_O, ticTacToeGame.getWinner());
    }

    @Test
    public void shouldDetermineWinnerXAfterFillingThirdColumn() {
        ticTacToeGame.playAtPosition(2);
        ticTacToeGame.playAtPosition(0);
        ticTacToeGame.playAtPosition(5);
        ticTacToeGame.playAtPosition(1);
        ticTacToeGame.playAtPosition(8);

        Assert.assertEquals(PLAYER_X, ticTacToeGame.getWinner());
    }

    @Test
    public void shouldDetermineWinnerOAfterFillingThirdColumn() {
        ticTacToeGame.playAtPosition(0);
        ticTacToeGame.playAtPosition(2);
        ticTacToeGame.playAtPosition(1);
        ticTacToeGame.playAtPosition(5);
        ticTacToeGame.playAtPosition(3);
        ticTacToeGame.playAtPosition(8);

        Assert.assertEquals(PLAYER_O, ticTacToeGame.getWinner());
    }

    @Test
    public void shouldDetermineWinnerXAfterFillingFirstRow() {
        ticTacToeGame.playAtPosition(0);
        ticTacToeGame.playAtPosition(3);
        ticTacToeGame.playAtPosition(1);
        ticTacToeGame.playAtPosition(4);
        ticTacToeGame.playAtPosition(2);

        Assert.assertEquals(PLAYER_X, ticTacToeGame.getWinner());
    }

    @Test
    public void shouldDetermineWinnerXAfterFillingSecondRow() {
        ticTacToeGame.playAtPosition(3);
        ticTacToeGame.playAtPosition(0);
        ticTacToeGame.playAtPosition(4);
        ticTacToeGame.playAtPosition(1);
        ticTacToeGame.playAtPosition(5);

        Assert.assertEquals(PLAYER_X, ticTacToeGame.getWinner());
    }
    @Test
    public void shouldDetermineWinnerXAfterFillingThirdRow() {
        ticTacToeGame.playAtPosition(6);
        ticTacToeGame.playAtPosition(0);
        ticTacToeGame.playAtPosition(7);
        ticTacToeGame.playAtPosition(1);
        ticTacToeGame.playAtPosition(8);

        Assert.assertEquals(PLAYER_X, ticTacToeGame.getWinner());
    }
    @Test
    public void shouldDetermineWinnerOAfterFillingFirstRow() {
        ticTacToeGame.playAtPosition(3);
        ticTacToeGame.playAtPosition(0);
        ticTacToeGame.playAtPosition(4);
        ticTacToeGame.playAtPosition(1);
        ticTacToeGame.playAtPosition(6);
        ticTacToeGame.playAtPosition(2);

        Assert.assertEquals(PLAYER_O, ticTacToeGame.getWinner());
    }
    @Test
    public void shouldDetermineWinnerOAfterFillingSecondRow() {
        ticTacToeGame.playAtPosition(0);
        ticTacToeGame.playAtPosition(3);
        ticTacToeGame.playAtPosition(1);
        ticTacToeGame.playAtPosition(4);
        ticTacToeGame.playAtPosition(6);
        ticTacToeGame.playAtPosition(5);

        Assert.assertEquals(PLAYER_O, ticTacToeGame.getWinner());
    }
    @Test
    public void shouldDetermineWinnerOAfterFillingThirdRow() {
        ticTacToeGame.playAtPosition(0);
        ticTacToeGame.playAtPosition(6);
        ticTacToeGame.playAtPosition(1);
        ticTacToeGame.playAtPosition(7);
        ticTacToeGame.playAtPosition(4);
        ticTacToeGame.playAtPosition(8);

        Assert.assertEquals(PLAYER_O, ticTacToeGame.getWinner());
    }
    @Test
    public void shouldDetermineWinnerXAfterFillingFirstDiagonal() {
        ticTacToeGame.playAtPosition(0);
        ticTacToeGame.playAtPosition(3);
        ticTacToeGame.playAtPosition(4);
        ticTacToeGame.playAtPosition(1);
        ticTacToeGame.playAtPosition(8);

        Assert.assertEquals(PLAYER_X, ticTacToeGame.getWinner());
    }
    @Test
    public void shouldDetermineWinnerXAfterFillingSecondDiagonal() {
        ticTacToeGame.playAtPosition(2);
        ticTacToeGame.playAtPosition(3);
        ticTacToeGame.playAtPosition(4);
        ticTacToeGame.playAtPosition(1);
        ticTacToeGame.playAtPosition(6);

        Assert.assertEquals(PLAYER_X, ticTacToeGame.getWinner());
    }
    @Test
    public void shouldDetermineWinnerOAfterFillingFirstDiagonal() {
        ticTacToeGame.playAtPosition(1);
        ticTacToeGame.playAtPosition(0);
        ticTacToeGame.playAtPosition(3);
        ticTacToeGame.playAtPosition(4);
        ticTacToeGame.playAtPosition(2);
        ticTacToeGame.playAtPosition(8);

        Assert.assertEquals(PLAYER_O, ticTacToeGame.getWinner());
    }
    @Test
    public void shouldDetermineWinnerOAfterFillingSecondDiagonal() {
        ticTacToeGame.playAtPosition(1);
        ticTacToeGame.playAtPosition(2);
        ticTacToeGame.playAtPosition(3);
        ticTacToeGame.playAtPosition(4);
        ticTacToeGame.playAtPosition(0);
        ticTacToeGame.playAtPosition(6);

        Assert.assertEquals(PLAYER_O, ticTacToeGame.getWinner());
    }

}
