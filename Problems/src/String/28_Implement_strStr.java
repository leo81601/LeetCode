package String;

/**
 * Implement strStr().
 *
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Example:
 *
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 *
 * Related Topics: Two Pointers, String
 */

class Implement_strStr {
    public int strStr(String haystack, String needle) {
        int len1 = haystack.length(), len2 = needle.length();
        if (len1 < len2) return -1;
        if (len2 == 0) return 0;
        int restLen = len1 - len2;
        for (int i = 0; i <= restLen; i++) {
            if (haystack.substring(i, i + len2).equals(needle)) return i;
        }
        return -1;
    }
}