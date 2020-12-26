package com.ibm.tictactoe.model.board;

import static com.ibm.tictactoe.model.board.BoardStructure.*;

import java.util.ArrayList;
import java.util.List;

import com.ibm.tictactoe.model.game.PlayerMark;

public class BoardLines {

    Line[] LINES = new Line[] {ROW_1, ROW_2, ROW_3,
                                COLUMN_1, COLUMN_2, COLUMN_3,
                                DIAGONAL_1, DIAGONAL_2};

    public boolean hasWinnerLine(Marks marks) {
        for (Line line : LINES) {
            if (line.isWinner(marks)) {
                return true;
            }
        }
        return false;
    }

    public Line winningLine(PlayerMark playerMark, Marks marks) {
        for (Line line : LINES) {
            if (line.isWinningLine(playerMark, marks)) {
                return line;
            }
        }
        return null;
    }

    public Line loosingLine(PlayerMark player, Marks marks) {
        return winningLine(player.opponent(), marks);
    }

    public List<Line> linesWhereJustOneCornerIsSelectedBy(PlayerMark playerMark, Marks marks) {
        List<Line> linesWithJustOneCornerMarked = new ArrayList<Line>();
        for (Line line : LINES_WITH_CORNERS) {
            if (line.hasSingleCornerMarkForPlayer(playerMark, marks)) {
                linesWithJustOneCornerMarked.add(line);
            }
        }
        return linesWithJustOneCornerMarked;
    }

    public PlayerMark winnerMark(Marks marks) {
        for (Line line : LINES) {
            if (line.isWinner(marks)) {
                return marks.markAt(line.firstCell);
            }
        }
        return null;
    }

    public List<Line> withSingleMark(PlayerMark playerMark, Marks marks) {
        List<Line> lines = new ArrayList<Line>();
        for (Line line : ALL_LINES) {
            if (line.hasSingleMark(playerMark, marks)) {
                lines.add(line);
            }
        }
        return lines;
    }
}
