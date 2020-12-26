package com.ibm.tictactoe.model.game;

import static com.ibm.tictactoe.model.board.BoardStructure.NO_CELL;

import java.util.Iterator;

import com.ibm.tictactoe.model.board.Marks;
import com.ibm.tictactoe.model.strategy.*;
import com.ibm.tictactoe.view.Console;

public class HumanPlayer implements Player {

    public static final String ASK_FOR_NEXT_MARK = "Choose an empty cell between 1 and 9  >>> ";

    private Console console;
    private PlayerMark playerMark;
    private GameStrategies gameStrategies1;

    public HumanPlayer(PlayerMark playerMark, Console console, GameStrategies gameStrategies1) {
        this.console = console;
        this.playerMark = playerMark;
        this.gameStrategies1 = gameStrategies1;
    }


    public void placeMarkOn(Marks marks) {
        try {
            int cell = cellToBeMarked(marks,ASK_FOR_NEXT_MARK);
            
            marks.placeMarkAt(cell, playerMark);
        } catch (Exception e) {
            placeMarkOn(marks);
        }
    }
    
    private int cellToBeMarked(Marks marks,String question) throws InterruptedException {
    	System.out.print(question);
    	Thread.sleep(1000);
        int cell = NO_CELL;
        Iterator<Strategy> strategies = gameStrategies1.iterator();
        while (strategies.hasNext()) {
            cell = strategies.next().nextCell(playerMark, marks);
            if (cell != NO_CELL) {
                break;
            }
        }
        System.out.print("  "+(cell+1));
        Thread.sleep(1000);
        return cell;
    }



    public PlayerMark mark() {
        return playerMark;
    }
}
