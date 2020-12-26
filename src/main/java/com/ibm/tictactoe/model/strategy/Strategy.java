package com.ibm.tictactoe.model.strategy;

import com.ibm.tictactoe.model.board.Marks;
import com.ibm.tictactoe.model.game.PlayerMark;

 public interface Strategy {

    int nextCell(PlayerMark playerMark, Marks marks);

}
