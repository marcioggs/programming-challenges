package com.marcioggs.neetcode150.arrayshashing.validsudoku;

import java.util.HashSet;

public class Solution {

  public boolean isValidSudoku(char[][] board) {

    for (var i = 0; i < board.length; i++) {
      var readCharactersInLine = new HashSet<Character>();
      for (var j = 0; j < board[i].length; j++) {
        if (board[i][j] == '.') {
          continue;
        }
        if (readCharactersInLine.contains(board[i][j])) {
          return false;
        }
        readCharactersInLine.add(board[i][j]);
      }

      var readCharactersInColumn = new HashSet<Character>();
      for (var j = 0; j < board[i].length; j++) {
        if (board[j][i] == '.') {
          continue;
        }
        if (readCharactersInColumn.contains(board[j][i])) {
          return false;
        }
        readCharactersInColumn.add(board[j][i]);
      }
    }

    for (var line = 0; line < 9; line += 3) {
      for (var column = 0; column < 9; column += 3) {
        var readCharactersInSquare = new HashSet<Character>();
        for (var lineOffset = 0; lineOffset < 3; lineOffset++) {
          for (var columnOffset = 0; columnOffset < 3; columnOffset++) {
            var currentCell = board[line + lineOffset][column + columnOffset];
            if (currentCell == '.') {
              continue;
            }
            if (readCharactersInSquare.contains(currentCell)) {
              return false;
            }
            readCharactersInSquare.add(currentCell);
          }
        }
      }
    }

    return true;
  }
}
