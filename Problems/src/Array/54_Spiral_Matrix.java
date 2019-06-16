package Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
 *
 * Example:
 *
 * Input:
 * [
 *  [ 1, 2, 3 ],
 *  [ 4, 5, 6 ],
 *  [ 7, 8, 9 ]
 * ]
 * Output: [1,2,3,6,9,8,7,4,5]
 *
 * Related Topics: Array
 */

class Spiral_Matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) return list;
        int rowbegin = 0, rowend = matrix.length - 1, colbegin = 0, colend = matrix[0].length - 1;
        while (rowbegin <= rowend && colbegin <= colend) {
            for (int i = colbegin; i <= colend; i++){
                list.add(matrix[rowbegin][i]);
            }
            rowbegin++;
            for (int i = rowbegin; i <= rowend; i++){
                list.add(matrix[i][colend]);
            }
            colend--;
            if (rowbegin <= rowend){
                for (int i = colend; i >= colbegin; i--){
                    list.add(matrix[rowend][i]);
                }
            }
            rowend--;
            if (colbegin <= colend){
                for (int i = rowend; i >= rowbegin; i--){
                    list.add(matrix[i][colbegin]);
                }
            }
            colbegin++;
        }
        return list;
    }
}