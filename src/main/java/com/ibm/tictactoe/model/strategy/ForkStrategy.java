package com.ibm.tictactoe.model.strategy;

import static com.ibm.tictactoe.model.board.BoardStructure.DIAGONALS;
import static com.ibm.tictactoe.model.board.BoardStructure.NO_CELL;

import com.ibm.tictactoe.model.board.Line;
import com.ibm.tictactoe.model.board.Marks;
import com.ibm.tictactoe.model.game.PlayerMark;

public class ForkStrategy implements Strategy {

    private static final int TWO_CELLS = 2;

    public int nextCell(PlayerMark playerMark, Marks marks) {
        if (marks.count() == TWO_CELLS) {
            for (Line diagonal : DIAGONALS) {
                if (isCandidateForAFork(marks, diagonal)) {
                    return diagonal.emptyEdgeCell(marks);
                }
            }
        }
        return NO_CELL;
    }

    private boolean isCandidateForAFork(Marks marks, Line diagonal) {
        return diagonal.numberOfMarkedCells(marks) == 2 && diagonal.emptyEdgeCell(marks) != NO_CELL;
    }

}
