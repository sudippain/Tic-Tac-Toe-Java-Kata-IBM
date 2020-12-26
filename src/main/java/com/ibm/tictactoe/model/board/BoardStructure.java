package com.ibm.tictactoe.model.board;

public interface BoardStructure {

    String[] EMPTY_BOARD = new String[]{" ", " ", " ", " ", " ", " ", " ", " ", " "};

    int CELL_1 = 0;
    int CELL_2 = 1;
    int CELL_3 = 2;
    int CELL_4 = 3;
    int CELL_5 = 4;
    int CELL_6 = 5;
    int CELL_7 = 6;
    int CELL_8 = 7;
    int CELL_9 = 8;

    Line ROW_1 = new Line(CELL_1, CELL_2, CELL_3);
    Line ROW_2 = new Line(CELL_4, CELL_5, CELL_6);
    Line ROW_3 = new Line(CELL_7, CELL_8, CELL_9);

    Line COLUMN_1 = new Line(CELL_1, CELL_4, CELL_7);
    Line COLUMN_2 = new Line(CELL_2, CELL_5, CELL_8);
    Line COLUMN_3 = new Line(CELL_3, CELL_6, CELL_9);

    Line DIAGONAL_1 = new Line(CELL_1, CELL_5, CELL_9);
    Line DIAGONAL_2 = new Line(CELL_3, CELL_5, CELL_7);

    Line[] DIAGONALS = new Line[] {DIAGONAL_1, DIAGONAL_2};

    Line[] LINES_WITH_CORNERS = new Line[] {
                                    DIAGONAL_1, DIAGONAL_2,
                                    ROW_1, ROW_3,
                                    COLUMN_1, COLUMN_3};

    Line[] ALL_LINES = new Line[] {
                                DIAGONAL_1, DIAGONAL_2,
                                ROW_1, ROW_2, ROW_3,
                                COLUMN_1, COLUMN_2, COLUMN_3
    };

    int[] SIDE_CELLS = new int[] {CELL_2, CELL_4, CELL_6, CELL_8};

    int[] ALL_CELLS = new int[] {
            CELL_1, CELL_2, CELL_3,
            CELL_4, CELL_5, CELL_6,
            CELL_7, CELL_8, CELL_9
    };

    int NO_CELL = -1;

    String EMPTY_CELL = " ";
}
