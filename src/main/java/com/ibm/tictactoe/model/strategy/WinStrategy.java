package com.ibm.tictactoe.model.strategy;

import static com.ibm.tictactoe.model.board.BoardStructure.NO_CELL;

import com.ibm.tictactoe.model.board.BoardLines;
import com.ibm.tictactoe.model.board.Line;
import com.ibm.tictactoe.model.board.Marks;
import com.ibm.tictactoe.model.game.PlayerMark;

public class WinStrategy implements Strategy {

    public int nextCell(PlayerMark playerMark, Marks marks) {
        Line winningLine = winningLineFor(playerMark, marks);
        if (winningLine != null) {
            return  winningLine.firstEmptyCell(marks);
        }
        return NO_CELL;
    }

    private Line winningLineFor(PlayerMark playerMark, Marks marks) {
        return new BoardLines().winningLine(playerMark, marks);
    }
}
