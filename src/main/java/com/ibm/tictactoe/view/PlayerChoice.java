package com.ibm.tictactoe.view;

import static com.ibm.tictactoe.model.game.PlayerMark.CROSS;
import static com.ibm.tictactoe.model.game.PlayerMark.NOUGHT;

import com.ibm.tictactoe.model.game.HumanPlayer;
import com.ibm.tictactoe.model.game.MachinePlayer;
import com.ibm.tictactoe.model.game.Player;
import com.ibm.tictactoe.model.game.PlayerMark;
import com.ibm.tictactoe.model.strategy.GameStrategies;

public class PlayerChoice {

    private final PlayerMark humanPlayerMark;
    private final Console console;

    public PlayerChoice(PlayerMark humanPlayerMark, Console console) {
        this.humanPlayerMark = humanPlayerMark;
        this.console = console;
    }

    public Player crossPlayer() {
        return CROSS.equals(humanPlayerMark)
                        ? createHumanPlayer()
                        : createMachinePlayer();
    }

    public Player noughtPlayer() {
        return NOUGHT.equals(humanPlayerMark)
                        ? createHumanPlayer()
                        : createMachinePlayer();
    }

    private Player createMachinePlayer() {
        PlayerMark machineMark = humanPlayerMark.opponent();
        return new MachinePlayer(machineMark, new GameStrategies(machineMark));
    }

    private Player createHumanPlayer() {
    	PlayerMark humanMark =  humanPlayerMark.opponent();
        return new HumanPlayer(humanPlayerMark, console,new GameStrategies(humanMark));
    }

}
