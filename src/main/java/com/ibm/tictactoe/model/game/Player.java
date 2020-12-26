package com.ibm.tictactoe.model.game;

import com.ibm.tictactoe.model.board.Marks;

public interface Player {
    void placeMarkOn(Marks marks);

    PlayerMark mark();
}
