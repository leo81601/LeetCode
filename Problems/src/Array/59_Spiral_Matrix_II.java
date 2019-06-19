package Array;

/**
 * Given a positive integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.
 *
 * Example:
 *
 * Input: 3
 * Output:
 * [
 *  [ 1, 2, 3 ],
 *  [ 8, 9, 4 ],
 *  [ 7, 6, 5 ]
 * ]
 *
 * Related Topics: Array
 */

class Spiral_Matrix_II {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int num = 1, rowBegin = 0, rowEnd = n - 1, colBegin = 0, colEnd = n - 1;
        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            for (int i = colBegin; i <= colEnd; i++) {
                result[rowBegin][i] = num;
                num++;
            }
            rowBegin++;
            for (int i = rowBegin; i <= rowEnd; i++) {
                result[i][colEnd] = num;
                num++;
            }
            colEnd--;
            for (int i = colEnd; i >= colBegin; i--) {
                result[rowEnd][i] = num;
                num++;
            }
            rowEnd--;
            for (int i = rowEnd; i >= rowBegin; i--) {
                result[i][colBegin] = num;
                num++;
            }
            colBegin++;
        }
        return result;
    }
}