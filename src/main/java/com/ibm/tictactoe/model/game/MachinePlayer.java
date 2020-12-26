package com.ibm.tictactoe.model.game;

import com.ibm.tictactoe.model.board.Marks;
import com.ibm.tictactoe.model.strategy.*;

import static com.ibm.tictactoe.model.board.BoardStructure.NO_CELL;

import java.util.Iterator;

public class MachinePlayer implements Player {

	private PlayerMark playerMark;
	private GameStrategies gameStrategies;

	public MachinePlayer(PlayerMark playerMark, GameStrategies gameStrategies) {
		this.playerMark = playerMark;
		this.gameStrategies = gameStrategies;
	}

	public void placeMarkOn(Marks marks) {
		int cell = cellToBeMarked(marks);

		marks.placeMarkAt(cell, playerMark);
	}

	public int cellToBeMarked(Marks marks) {
		int cell = NO_CELL;
		Iterator<Strategy> strategies = gameStrategies.iterator();

		while (strategies.hasNext()) {
			cell = strategies.next().nextCell(playerMark, marks);
			if (cell != NO_CELL) {
				break;
			}
		}
		return cell;
	}

	public PlayerMark mark() {
		return playerMark;
	}

}
