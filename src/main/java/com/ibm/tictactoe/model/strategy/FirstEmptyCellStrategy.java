package com.ibm.tictactoe.model.strategy;

import com.ibm.tictactoe.model.board.Marks;
import com.ibm.tictactoe.model.game.PlayerMark;

public class FirstEmptyCellStrategy implements Strategy {

    public int nextCell(PlayerMark playerMark, Marks marks) {
        return marks.firstEmptyCell();
    }
}
