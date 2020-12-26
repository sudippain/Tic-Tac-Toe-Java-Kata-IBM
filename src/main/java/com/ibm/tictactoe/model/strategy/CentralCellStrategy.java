package com.ibm.tictactoe.model.strategy;

import static com.ibm.tictactoe.model.board.BoardStructure.CELL_5;
import static com.ibm.tictactoe.model.board.BoardStructure.NO_CELL;

import com.ibm.tictactoe.model.board.Marks;
import com.ibm.tictactoe.model.game.PlayerMark;

public class CentralCellStrategy implements Strategy {

    public int nextCell(PlayerMark playerMark, Marks marks) {
        return marks.isEmptyAt(CELL_5)
                        ? CELL_5
                        : NO_CELL;
    }

}
