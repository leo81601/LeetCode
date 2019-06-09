package Array;

public class Word_Search {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length; j++){
                if (existword(board, i, j, word, 0)) return true;
            }
        }
        return false;
    }

    private boolean existword(char[][] board, int i, int j, String word, int index){
        if (index >= word.length()) return true;
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) return false;
        if (board[i][j] == word.charAt(index)){
            index++;
            char c = board[i][j];
            board[i][j] = '#';
            boolean ans = existword(board, i + 1, j, word, index) || existword(board, i - 1, j, word, index) ||
                    existword(board, i, j + 1, word, index) || existword(board, i, j - 1, word, index);
            board[i][j] = c;
            return ans;
        }
        return false;
    }
}
