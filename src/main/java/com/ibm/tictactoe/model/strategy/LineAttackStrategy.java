package com.ibm.tictactoe.model.strategy;

import com.ibm.tictactoe.model.board.BoardLines;
import com.ibm.tictactoe.model.board.Line;
import com.ibm.tictactoe.model.board.Marks;
import com.ibm.tictactoe.model.game.PlayerMark;

import static com.ibm.tictactoe.model.board.BoardStructure.NO_CELL;

import java.util.List;

public class LineAttackStrategy implements Strategy {

    public int nextCell(PlayerMark playerMark, Marks marks) {
        List<Line> lines = linesWithSingleMarkFor(playerMark, marks);
        return (lines.size() > 0)
                    ? lines.get(0).emptyEdgeCell(marks)
                    : NO_CELL;
    }

    private List<Line> linesWithSingleMarkFor(PlayerMark playerMark, Marks marks) {
        return new BoardLines().withSingleMark(playerMark, marks);
    }

}
