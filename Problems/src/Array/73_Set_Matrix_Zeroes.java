package Array;

/**
 * Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in-place.
 *
 * Example 1:
 *
 * Input:
 * [
 *   [1,1,1],
 *   [1,0,1],
 *   [1,1,1]
 * ]
 * Output:
 * [
 *   [1,0,1],
 *   [0,0,0],
 *   [1,0,1]
 * ]
 *
 * Related Topics: Array
 */

class Set_Matrix_Zeroes {
    public void setZeroes(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return;
        int row = matrix.length, col = matrix[0].length;
        boolean isRow = false, isCol = false;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                    if (i == 0) isRow = true;
                    if (j == 0) isCol = true;
                }
            }
        }
        for (int i = 1; i < row; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < col; j++) matrix[i][j] = 0;
            }
        }
        for (int j = 1; j < col; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 1; i < row; i++) matrix[i][j] = 0;
            }
        }
        if (isRow) {
            for (int j = 0; j < col; j++) matrix[0][j] = 0;
        }
        if (isCol) {
            for (int i = 0; i < row; i++) matrix[i][0] = 0;
        }
    }
}