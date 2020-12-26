package com.ibm.tictactoe.view;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.runners.MockitoJUnitRunner;

import com.ibm.tictactoe.model.board.Marks;
import com.ibm.tictactoe.model.game.PlayerMark;
import com.ibm.tictactoe.view.BoardDisplay;
import com.ibm.tictactoe.view.Console;

import java.util.ArrayList;
import java.util.List;

import static com.ibm.tictactoe.builder.MarksBuilder.emptyMarks;
import static com.ibm.tictactoe.view.BoardDisplay.*;
import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class BoardDisplayShould {



	private List<String> printedLines;
	private Console console;

	private BoardDisplay boardDisplay;

	@Before
	public void initialise() {
		printedLines = new ArrayList<String>();
		console = createConsole();
		boardDisplay = new BoardDisplay(console);
	}

	@Test
	public void display_instructions() {
		String emptyBoard = "   |   |   " + '\n' + "---+---+---" + '\n' + "   |   |   " + '\n' + "---+---+---" + '\n'
				+ "   |   |   ";

		boardDisplay.displayGameInstructions(emptyMarks());
		
		assertThat(printedLines, hasItems(CELL_INDEX_INSTRUCTIONS, CURRENT_BOARD_STATE_MESSAGE, emptyBoard));
	}

	private Console createConsole() {

		return new Console() {
			@Override
			public void printLines(String... lines) {
				printedLines.addAll(asList(lines));
			}
		};
	}

}
