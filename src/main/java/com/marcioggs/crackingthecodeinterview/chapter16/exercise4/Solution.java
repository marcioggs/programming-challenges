package com.marcioggs.crackingthecodeinterview.chapter16.exercise4;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean gameIsWon(Board board) {

        Set<Token> winningTokens = new HashSet<>();

        Set<WinningTriple> winningTriples = getWinningTriples();

        for (WinningTriple winningTriple : winningTriples) {
            if (board.get(winningTriple.positions[0]) != null &&
                    board.get(winningTriple.positions[0]).equals(board.get(winningTriple.positions[1])) &&
                    board.get(winningTriple.positions[0]).equals(board.get(winningTriple.positions[2]))) {
                winningTokens.add(board.get(winningTriple.positions[0]));
            }
        }

        return winningTokens.size() == 1;
    }

    private Set<WinningTriple> getWinningTriples() {
        Set<WinningTriple> winningTriples = new HashSet<>();

        winningTriples.add(new WinningTriple(new Position(0, 0), new Position(0, 1), new Position(0, 2)));
        winningTriples.add(new WinningTriple(new Position(0, 0), new Position(1, 0), new Position(2, 0)));
        winningTriples.add(new WinningTriple(new Position(2, 0), new Position(2, 1), new Position(2, 2)));
        winningTriples.add(new WinningTriple(new Position(0, 2), new Position(1, 2), new Position(2, 2)));
        winningTriples.add(new WinningTriple(new Position(0, 0), new Position(1, 1), new Position(2, 2)));
        winningTriples.add(new WinningTriple(new Position(0, 2), new Position(1, 1), new Position(3, 0)));

        return winningTriples;
    }

    public enum Token {
        X,
        O
    }

    public static class Board {
        private Token[][] board = new Token[3][3];

        public void set(Token token, int row, int col) {
            board[row][col] = token;
        }

        public Token get(Position position) {
            return board[position.row][position.col];
        }
    }

    private static class Position {
        private int row;
        private int col;

        private Position(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    private static class WinningTriple {
        private Position[] positions = new Position[3];

        public WinningTriple(Position pos1, Position pos2, Position pos3) {
            positions[0] = pos1;
            positions[1] = pos2;
            positions[2] = pos3;
        }
    }
}
