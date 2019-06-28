package Backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
 *
 * Example:
 *
 * Input: n = 4, k = 2
 * Output:
 * [
 *   [2,4],
 *   [3,4],
 *   [2,3],
 *   [1,2],
 *   [1,3],
 *   [1,4],
 * ]
 *
 * Related Topics: Backtracking
 */

class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if (n < 1) return result;
        List<Integer> list = new ArrayList<>();
        helper(result, list, n, k, 1);
        return result;
    }

    private void helper(List<List<Integer>> result, List<Integer> list, int n, int k, int num) {
        if (k == 0) result.add(new ArrayList<>(list));
        for (int i = num; i <= n; i++) {
            list.add(i);
            helper(result, list, n, k - 1, i + 1);
            list.remove(list.size() - 1);
        }
    }
}