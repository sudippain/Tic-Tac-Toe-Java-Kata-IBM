package com.ibm.tictactoe.model.strategy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.ibm.tictactoe.model.board.Marks;
import com.ibm.tictactoe.model.game.PlayerMark;
import com.ibm.tictactoe.model.strategy.WinStrategy;

import java.util.Arrays;

import static com.ibm.tictactoe.model.board.BoardStructure.*;
import static com.ibm.tictactoe.model.game.PlayerMark.CROSS;
import static com.ibm.tictactoe.model.game.PlayerMark.NOUGHT;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class WinStrategyVerticalShould {


	@Parameters(name = "PLAYER {1} WON With Vertical Line! Where Cell position {2}")
	public static Iterable<Object[]> marks() {
	return Arrays.asList(new Object[][]{
	// TEST CASE 2
	{new String[]{" ", " ", " ", "X", "0", " ", "X", " ", "0"}, CROSS, CELL_1},
	{new String[]{"X", " ", " ", " ", "0", " ", "X", " ", "0"}, CROSS, CELL_4},
	{new String[]{"X", " ", " ", "X", "0", " ", " ", " ", "0"}, CROSS, CELL_7},



	});
	}
	
    private WinStrategy markStrategy = new WinStrategy();

    private final int cellToBeMarked;
    private final PlayerMark playerMark;
    private final Marks marks;

    public WinStrategyVerticalShould(String[] marks, PlayerMark playerMark, int cellToBeMarked) {
        this.marks = new Marks(marks);
        this.playerMark = playerMark;
        this.cellToBeMarked = cellToBeMarked;
    }

    @Test public void
    return_the_winning_cell_to_be_marked() {

        assertThat(markStrategy.nextCell(playerMark, marks), is(cellToBeMarked));
    }

}
