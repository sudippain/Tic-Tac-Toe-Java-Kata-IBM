package com.ibm.tictactoe.model.strategy;

import com.ibm.tictactoe.model.board.BoardLines;
import com.ibm.tictactoe.model.board.Line;
import com.ibm.tictactoe.model.board.Marks;
import com.ibm.tictactoe.model.game.PlayerMark;

import static com.ibm.tictactoe.model.board.BoardStructure.NO_CELL;

import java.util.List;

public class CornerAttackStrategy implements Strategy {

    public int nextCell(PlayerMark playerMark, Marks marks) {
        List<Line> lines = linesWithJustOneCornerSelectedFor(playerMark, marks);
        if (!lines.isEmpty()) {
            return lines.get(0).emptyEdgeCell(marks);
        }
        return NO_CELL;
    }

    private List<Line> linesWithJustOneCornerSelectedFor(PlayerMark playerMark, Marks marks) {
        return new BoardLines().linesWhereJustOneCornerIsSelectedBy(playerMark, marks);
    }
}
