package com.ibm.tictactoe.model.strategy;

import static com.ibm.tictactoe.model.board.BoardStructure.NO_CELL;

import com.ibm.tictactoe.model.board.BoardLines;
import com.ibm.tictactoe.model.board.Line;
import com.ibm.tictactoe.model.board.Marks;
import com.ibm.tictactoe.model.game.PlayerMark;

public class BlockStrategy implements Strategy {

    public int nextCell(PlayerMark playerMark, Marks marks) {
        Line loosingLine = loosingLineFor(playerMark, marks);
        if (loosingLine != null) {
            return loosingLine.firstEmptyCell(marks);
        }
        return NO_CELL;
    }

    private Line loosingLineFor(PlayerMark playerMark, Marks marks) {
        return new BoardLines().loosingLine(playerMark, marks);
    }
}
