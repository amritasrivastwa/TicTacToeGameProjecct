package com.kata.TictacToe;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GameTest {

    private Game ticTacToeGame;
    @Before
    public void init() {
        ticTacToeGame = new Game();
    }

    @Test
    public void shouldReturnXOnFirstTurn() {
        Assert.assertEquals('X', ticTacToeGame.getPlayer(1));
    }

    @Test
    public void shouldReturnOonSecondTurn(){
        Assert.assertEquals('O',ticTacToeGame.getPlayer(2));
    }

}
