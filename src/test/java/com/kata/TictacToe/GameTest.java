package com.kata.TictacToe;

import org.junit.Assert;
import org.junit.Test;

public class GameTest {
    @Test
    public void shouldReturnXOnFirstTurn(){

        Game ticTacToeGame = new Game();
        Assert.assertEquals('X',ticTacToeGame.getPlayer());
    }

}
