package Dynamic_Programming;

/**
 * You are climbing a stair case. It takes n steps to reach to the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * Note: Given n will be a positive integer.
 *
 * Example:
 *
 * Input: 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 *
 * Related Topics: Dynamic Programming
 */

class Climbing_Stairs {
    public int climbStairs(int n) {
        int[] result = new int[n];
        result[0] = 1;
        if (n >= 2) result[1] = 2;
        for (int i = 2; i < n; i++) result[i] = result[i - 1] + result[i - 2];
        return result[n - 1];
    }
}