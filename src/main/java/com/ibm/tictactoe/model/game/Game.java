package com.ibm.tictactoe.model.game;

import com.ibm.tictactoe.model.board.BoardLines;
import com.ibm.tictactoe.model.board.Marks;
import com.ibm.tictactoe.view.BoardDisplay;

import static com.ibm.tictactoe.model.board.BoardStructure.EMPTY_BOARD;
import static java.util.Arrays.copyOf;

public class Game {

    private final Marks marks = initialiseMarks();
    private final BoardLines boardLines = newBoardLines();

    private final BoardDisplay boardDisplay;
    private final Player crossesPlayer;
    private final Player noughtsPlayer;

    private Player currentPlayer;

    public Game(BoardDisplay boardDisplay, Player noughtsPlayer, Player crossesPlayer) {
        this.boardDisplay = boardDisplay;
        this.noughtsPlayer = noughtsPlayer;
        this.crossesPlayer = crossesPlayer;

        this.currentPlayer = noughtsPlayer;
    }

    public void startNewGame() {
        boardDisplay.displayGameInstructions(marks);
        while (!isOver()) {
            boardDisplay.nextPlayerIs(currentPlayer.mark());
            currentPlayer.placeMarkOn(marks);
            boardDisplay.displayBoardWith(marks);
            switchCurrentPlayerToNextPlayer();
        }
    }

    public void displayGameResult() {
        PlayerMark winner = boardLines.winnerMark(marks);
        boardDisplay.displayGameResult(winner);
    }

    private void switchCurrentPlayerToNextPlayer() {
        currentPlayer = currentPlayer.equals(noughtsPlayer)
                                ? crossesPlayer
                                : noughtsPlayer;
    }

    private boolean isOver() {
        return hasWinner() || marks.isFull();
    }

    private boolean hasWinner() {
        return boardLines.hasWinnerLine(marks);
    }

    protected Marks initialiseMarks() {
        return new Marks(copyOf(EMPTY_BOARD, EMPTY_BOARD.length));
    }

    protected BoardLines newBoardLines() {
        return new BoardLines();
    }

}
