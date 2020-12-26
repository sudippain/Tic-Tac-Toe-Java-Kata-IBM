package com.ibm.tictactoe.model.strategy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.ibm.tictactoe.model.board.Marks;
import com.ibm.tictactoe.model.game.PlayerMark;
import com.ibm.tictactoe.model.strategy.WinStrategy;

import java.util.Arrays;

import static com.ibm.tictactoe.model.board.BoardStructure.*;
import static com.ibm.tictactoe.model.game.PlayerMark.CROSS;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class WinStrategyDiagonalShould {


	@Parameters(name = "PLAYER {1} WON With Diagonal Line! Where Cell position {2}")
	public static Iterable<Object[]> marks() {
	return Arrays.asList(new Object[][]{
	
		{new String[]{"X", " ", " ", "0", "X", " ", "0", " ", " "}, CROSS, CELL_9},
		{new String[]{" ", " ", " ", "0", "X", " ", "0", " ", "X"}, CROSS, CELL_1},
		{new String[]{"X", " ", " ", "0", " ", " ", "0", " ", "X"}, CROSS, CELL_5},
	});
	}
	
    private WinStrategy markStrategy = new WinStrategy();

    private final int cellToBeMarked;
    private final PlayerMark playerMark;
    private final Marks marks;

    public WinStrategyDiagonalShould(String[] marks, PlayerMark playerMark, int cellToBeMarked) {
        this.marks = new Marks(marks);
        this.playerMark = playerMark;
        this.cellToBeMarked = cellToBeMarked;
    }

    @Test public void
    return_the_winning_cell_to_be_marked() {

        assertThat(markStrategy.nextCell(playerMark, marks), is(cellToBeMarked));
    }

}
