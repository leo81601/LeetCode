package String;

/**
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 *
 * Related Topics: String, Dynamic_Programming
 */

class Longest_Palindromic_Substring {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) return s;
        String longest = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            String temp = isPalindrome(s, i, i);
            if (temp.length() > longest.length()) longest = temp;
            temp = isPalindrome(s, i, i + 1);
            if (temp.length() > longest.length()) longest = temp;
        }
        return longest;
    }

    private String isPalindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}