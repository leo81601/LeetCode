package Dynamic_Programming;

/**
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 *
 * The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 *
 * Now consider if some obstacles are added to the grids. How many unique paths would there be?
 *
 * An obstacle and empty space is marked as 1 and 0 respectively in the grid.
 *
 * Example:
 *
 * Input:
 * [
 *   [0,0,0],
 *   [0,1,0],
 *   [0,0,0]
 * ]
 * Output: 2
 * Explanation:
 * There is one obstacle in the middle of the 3x3 grid above.
 * There are two ways to reach the bottom-right corner:
 * 1. Right -> Right -> Down -> Down
 * 2. Down -> Down -> Right -> Right
 *
 * Related Topics: Array, Dynamic Programming
 */

class Unique_Path_II {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        if (n == 0) return 0;
        int[][] result = new int[m][n];
        result[0][0] = obstacleGrid[0][0] == 1 ? 0 : 1;
        for (int i = 1; i < m; i++) result[i][0] = obstacleGrid[i][0] == 1 ? 0 : result[i - 1][0];
        for (int j = 1; j < n; j++) result[0][j] = obstacleGrid[0][j] == 1 ? 0 : result[0][j - 1];
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                result[i][j] = obstacleGrid[i][j] == 1 ? 0 : result[i - 1][j] + result[i][j - 1];
            }
        }
        return result[m - 1][n - 1];
    }
}