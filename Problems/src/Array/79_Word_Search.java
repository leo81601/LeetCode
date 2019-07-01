package Array;

/**
 * Given a 2D board and a word, find if the word exists in the grid.
 *
 * The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.
 *
 * Example:
 *
 * board =
 * [
 *   ['A','B','C','E'],
 *   ['S','F','C','S'],
 *   ['A','D','E','E']
 * ]
 *
 * Given word = "ABCCED", return true.
 * Given word = "SEE", return true.
 * Given word = "ABCB", return false.
 *
 * Related Topics: Array, Backtracking
 */

class Word_Search {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (existWord(board, word, i, j,  0)) return true;
            }
        }
        return false;
    }

    private boolean existWord(char[][] board, String word, int i, int j, int index) {
        if (index >= word.length()) return true;
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) return false;
        if (board[i][j] == word.charAt(index)) {
            index++;
            char c = board[i][j];
            board[i][j] = '*';
            boolean result = existWord(board, word, i - 1, j, index) || existWord(board, word, i + 1, j, index)
                    || existWord(board, word, i, j - 1, index) || existWord(board, word, i, j +1, index);
            board[i][j] = c;
            return result;
        }
        return false;
    }
}