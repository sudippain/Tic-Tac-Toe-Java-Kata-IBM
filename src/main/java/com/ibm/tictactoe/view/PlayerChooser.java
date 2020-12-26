package com.ibm.tictactoe.view;

import com.ibm.tictactoe.model.game.PlayerMark;

public class PlayerChooser {

    public static String WHICH_PLAYER_DO_YOU_WANT_TO_BE = "Do you want to be CROSS or NOUGHT? Please type 'X' or '0'? ";

    private final Console console;

    public PlayerChooser(Console console) {
        this.console = console;
    }

    public PlayerChoice choose() {
        return new PlayerChoice(getHumanPlayerMarker(), console);
    }

    private PlayerMark getHumanPlayerMarker() {
        PlayerMark playerMark;
        String mark;
        do {
            mark = console.getStringAnswerFor(WHICH_PLAYER_DO_YOU_WANT_TO_BE).toUpperCase();
            playerMark = PlayerMark.byMark(mark);
        } while (playerMark == null);
        return playerMark;
    }
}
