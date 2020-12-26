package com.ibm.tictactoe;

import com.ibm.tictactoe.model.game.Game;
import com.ibm.tictactoe.view.BoardDisplay;
import com.ibm.tictactoe.view.Console;
import com.ibm.tictactoe.view.PlayerChoice;
import com.ibm.tictactoe.view.PlayerChooser;

public class TicTacToe {

    public static void main(String[] args) {
        play(newGame());
    }

    private static void play(Game game) {
        game.startNewGame();
        game.displayGameResult();
    }

    private static Game newGame() {
        Console console = new Console();
        BoardDisplay boardDisplay = new BoardDisplay(console);
        PlayerChoice playerChoice = new PlayerChooser(console).choose();

        return new Game(boardDisplay,
                        playerChoice.crossPlayer(),
                        playerChoice.noughtPlayer());
    }

}
