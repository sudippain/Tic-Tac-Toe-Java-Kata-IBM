package com.ibm.tictactoe.model.strategy;

import static com.ibm.tictactoe.model.game.PlayerMark.CROSS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.ibm.tictactoe.model.game.PlayerMark;

public class GameStrategies implements Iterable<Strategy> {

    private List<Strategy> strategies = new ArrayList<Strategy>();

    public GameStrategies(PlayerMark playerMark) {
        createListOfStrategiesFor(playerMark);
    }

    public Iterator<Strategy> iterator() {
        return strategies.iterator();
    }

    public int size() {
        return strategies.size();
    }

    private void createListOfStrategiesFor(PlayerMark playerMark) {
        if (CROSS.equals(playerMark)) {
            prepareCrossStrategies();
        } else {
            prepareNoughtStrategies();
        }
    }

    private void prepareCrossStrategies() {
        strategies.add(new WinStrategy());
        strategies.add(new BlockStrategy());
        strategies.add(new ForkStrategy());
        strategies.add(new CornerAttackStrategy());
        strategies.add(new LineAttackStrategy());
        strategies.add(new FirstEmptyCellStrategy());
    }

    private void prepareNoughtStrategies() {
        strategies.add(new CentralCellStrategy());
        strategies.add(new WinStrategy());
        strategies.add(new BlockStrategy());
        strategies.add(new BlockingForkStrategy());
        strategies.add(new ForkStrategy());
        strategies.add(new CornerAttackStrategy());
        strategies.add(new LineAttackStrategy());
        strategies.add(new FirstEmptyCellStrategy());
    }

}
