package Backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string containing only digits, restore it by returning all possible valid IP address combinations.
 *
 * Example:
 *
 * Input: "25525511135"
 * Output: ["255.255.11.135", "255.255.111.35"]
 *
 * Related Topics: String, Backtracking
 */

class Restore_IP_Addresses {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        if (s == null || s.length() == 0) return result;
        helper(result, s, 0, "", 0);
        return result;
    }

    private void helper(List<String> result, String s, int index, String res, int count) {
        if (count > 4) return;
        if (count == 4 && index == s.length()) {
            result.add(res);
            return;
        }
        for (int i = 1; i < 4; i++) {
            if (index + i > s.length()) break;
            String temp = s.substring(index, index + i);
            if (temp.startsWith("0") && temp.length() > 1 || i == 3 && Integer.parseInt(temp) > 255) continue;
            helper(result, s, index + i, res + temp + (count == 3 ? "" : "."), count + 1);
        }
    }
}