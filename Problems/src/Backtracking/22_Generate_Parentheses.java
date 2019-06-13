package Backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 *
 * For example, given n = 3, a solution set is:
 *
 * [
 *   "((()))",
 *   "(()())",
 *   "(())()",
 *   "()(())",
 *   "()()()"
 * ]
 *
 * Related Topics: String, Backtracking
 */

class Generate_Parentheses {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        String s = "";
        helper(s, n, n, list);
        return list;
    }

    private void helper(String s, int left, int right, List<String> list) {
        if (left == 0 && right == 0) {
            list.add(s);
            return;
        }
        if (left > right) return;
        if (left > 0) helper(s + "(", left - 1, right, list);
        if (right > 0) helper(s + ")", left, right - 1, list);
    }
}