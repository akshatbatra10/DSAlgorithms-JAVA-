class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (Character.isDigit(board[i][j])) {
                    if (!isValid(board, i, j, board[i][j])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public boolean isValid(char[][] board, int cr, int cc, int val) {
        int c = 0;
		while (c < 9) {
			if (board[cr][c] == val && c != cc) {
				return false;
			}
			c++;
		}

		int r = 0;
		while (r < 9) {
			if (board[r][cc] == val && r != cr) {
				return false;
			}
			r++;
		}
        r = cr - cr % 3;
        c = cc - cc % 3;
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (board[i][j] == val && i != cr && j != cc) {
                    return false;
                }
            }
        }
        return true;
    }
}