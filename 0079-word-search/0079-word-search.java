class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (found(board, word, i, j, m, n, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean found(char[][] board, String word, int i, int j, int m, int n, int k) {
        if (k == word.length()) {
            return true;
        }
        if (i == m || i == -1 || j == n || j == -1 || board[i][j] != word.charAt(k)) {
            return false;
        }
        board[i][j] = '*';
        boolean ans = found(board, word, i, j + 1, m, n, k + 1) ||
            found(board, word, i + 1, j, m, n, k + 1) ||
            found(board, word, i, j - 1, m, n, k + 1) ||
            found(board,word, i - 1, j, m, n, k + 1);
        board[i][j] = word.charAt(k);
        return ans;
    }
}