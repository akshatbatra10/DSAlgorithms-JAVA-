/* 

  Count N Queens, backtracking problem.
  (count number of ways N queens can be placed on an NxN board, without any cutting each other)

*/

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println(getBoardPath(0, 10));
    }

    public static int countNQueens(boolean[][] board, int row) {
        if (row == board.length) {
            return 1;
        }
        int count = 0;
        for (int col = 0; col < board[row].length; col++) {
            if (isItSafe(board, row, col)) {
                board[row][col] = true;
                count = count + countNQueens(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }

    private static boolean isItSafe(boolean[][] board, int row, int col) {
        for (int i = row; i >= 0; i--) {
            if (board[i][col])
                return false;
        }
        for (int i = row,j = col; i >= 0 && j >= 0; i--,j--) {
            if (board[i][j]) {
                return false;
            }
        }
        for (int i = row,j = col; i >= 0 && j < board.length; i--,j++) {
            if (board[i][j]) {
                return false;
            }
        }
        return true;
    }
}