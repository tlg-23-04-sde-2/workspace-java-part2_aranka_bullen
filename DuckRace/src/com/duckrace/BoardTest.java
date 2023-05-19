package com.duckrace;

import static org.junit.Assert.*;

public class BoardTest {
    public static void main(String[] args) {

        //create a Board object which initializes its fields causing it to get read.
        Board board = new Board();
        board.dumpStudentIdMap();

        //update the board a few times, each time requirea sn id and a reward
        board.updatesBoard(3, Reward.PRIZES);
        board.updatesBoard( 3, Reward.DEBIT_CARD);
        board.updatesBoard(10, Reward.DEBIT_CARD);
        board.updatesBoard( 13, Reward.DEBIT_CARD);
        board.updatesBoard(1, Reward.PRIZES);
        board.updatesBoard( 5, Reward.DEBIT_CARD);
        board.updatesBoard( 3, Reward.DEBIT_CARD);
        board.updatesBoard( 13, Reward.DEBIT_CARD);

        board.dumpRacerMap();

    }
}