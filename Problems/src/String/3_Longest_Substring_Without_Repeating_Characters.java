package String;

import java.util.HashMap;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Related Topics: Hash_Table, Two_Pointers, String, Sliding Windows
 */

class Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {
        int maxlen = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0, j = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) j = Math.max(j, map.get(s.charAt(i)) + 1);
            map.put(s.charAt(i), i);
            maxlen = Math.max(maxlen, i - j + 1);
        }
        return maxlen;
    }
}