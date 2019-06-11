package String;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 * Related Topics: String
 */

class Longest_Commom_Prefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        for (int i = 0; i < strs[0].length(); i++) {
            for (String str : strs) {
                if (i == str.length() || str.charAt(i) != strs[0].charAt(i)) return strs[0].substring(0,i);
            }
        }
        return strs[0];
    }
}