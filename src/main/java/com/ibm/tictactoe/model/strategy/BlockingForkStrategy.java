package com.ibm.tictactoe.model.strategy;

import com.ibm.tictactoe.model.board.Line;
import com.ibm.tictactoe.model.board.Marks;
import com.ibm.tictactoe.model.game.PlayerMark;

import static com.ibm.tictactoe.model.board.BoardStructure.*;
import static com.ibm.tictactoe.model.game.PlayerMark.CROSS;
import static com.ibm.tictactoe.model.game.PlayerMark.NOUGHT;

public class BlockingForkStrategy implements Strategy {

    public int nextCell(PlayerMark playerMark, Marks marks) {
        return (anyForkThreatFor(marks))
                        ? marks.firstEmptySideCell()
                        : NO_CELL;
    }

    private boolean anyForkThreatFor(Marks marks) {
        return forkThreatOn(DIAGONAL_1, marks) || forkThreatOn(DIAGONAL_2, marks);
    }

    private boolean forkThreatOn(Line diagonal, Marks marks) {
        return
               CROSS .equals(marks.markAt(diagonal.firstCell))
            && NOUGHT.equals(marks.markAt(diagonal.secondCell))
            && CROSS .equals(marks.markAt(diagonal.thirdCell));
    }

}
