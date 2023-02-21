package com.marcioggs.crackingthecodeinterview.chapter16.exercise4;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void gameIsWonOnFirstRow() {
        Solution.Board board = new Solution.Board();

        board.set(Solution.Token.O, 0, 0);
        board.set(Solution.Token.O, 0, 1);
        board.set(Solution.Token.O, 0, 2);

        board.set(Solution.Token.X, 2, 2);
        board.set(Solution.Token.X, 2, 1);

        assertEquals(true, new Solution().gameIsWon(board));
    }

    @Test
    public void gameIsTied() {
        Solution.Board board = new Solution.Board();

        board.set(Solution.Token.O, 0, 0);
        board.set(Solution.Token.O, 0, 1);
        board.set(Solution.Token.O, 0, 2);

        board.set(Solution.Token.X, 2, 0);
        board.set(Solution.Token.X, 2, 1);
        board.set(Solution.Token.X, 2, 2);

        assertEquals(false, new Solution().gameIsWon(board));
    }

    @Test
    public void nobodyWon() {
        Solution.Board board = new Solution.Board();

        board.set(Solution.Token.O, 0, 0);
        board.set(Solution.Token.O, 0, 1);
        board.set(Solution.Token.O, 1, 2);

        board.set(Solution.Token.X, 2, 0);
        board.set(Solution.Token.X, 2, 1);
        board.set(Solution.Token.X, 1, 1);

        assertEquals(false, new Solution().gameIsWon(board));
    }
}