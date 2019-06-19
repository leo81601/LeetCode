package String;

/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 *
 * If the last word does not exist, return 0.
 *
 * Note: A word is defined as a character sequence consists of non-space characters only.
 *
 * Example:
 *
 * Input: "Hello World"
 * Output: 5
 *
 * Related Topics: String
 */

class Length_of_Last_Word {
    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) return 0;
        int len = 0, end = s.length() - 1;
        while (end >= 0 && s.charAt(end) == ' ') end--;
        while (end >= 0 && s.charAt(end) != ' ') {
            len++;
            end--;
        }
        return len;
    }
}