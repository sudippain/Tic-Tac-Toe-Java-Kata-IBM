package com.ibm.tictactoe.model.strategy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.ibm.tictactoe.model.board.Marks;
import com.ibm.tictactoe.model.game.PlayerMark;
import com.ibm.tictactoe.model.strategy.BlockStrategy;
import com.ibm.tictactoe.model.strategy.Strategy;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Arrays;

import static com.ibm.tictactoe.model.board.BoardStructure.*;
import static com.ibm.tictactoe.model.game.PlayerMark.CROSS;
import static com.ibm.tictactoe.model.game.PlayerMark.NOUGHT;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DrawStrategiesShould {
	private Strategy blockStrategy = new BlockStrategy();

	private final int cellToBeMarked;
	private final PlayerMark playerMark;
	private final Marks marks;
	@Parameters(name = "Game Ends With A Draw ")
	@Given("^Execute Draw Strategies$")
	public static Iterable<Object[]> marks()  throws Throwable{
		return Arrays.asList(new Object[][] {

				{ new String[] { "X", "0", "X", "0", "0", "X", "X", "X", " " }, NOUGHT, CELL_9 }

		});
	}

	
	
	
	public DrawStrategiesShould(String[] marks, PlayerMark playerMark, int cellToBeMarked) {
		this.marks = new Marks(marks);
		this.playerMark = playerMark;
		this.cellToBeMarked = cellToBeMarked;
	}
//	int temp=0;
//	@When("^If i will enter$")
//	public void if_i_will_enter()  throws Throwable {
//		temp = cellToBeMarked;
//	}

	@Test
	@Then("^we should get draw game$")
	public void return_the_draw_cell_to_be_marked()  throws Throwable {

		assertThat(blockStrategy.nextCell(playerMark, marks), is(cellToBeMarked));
	}

}
