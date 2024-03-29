package String;

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 *
 * Write the code that will take a string and make this conversion given a number of rows.
 *
 * Example:
 *
 * Input: s = "PAYPALISHIRING", numRows = 3
 * Output: "PAHNAPLSIIGYIR"
 *
 * Related Topics: String
 */

class ZigZag_Conversion {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        StringBuilder sb = new StringBuilder();
        int next = numRows * 2 - 2;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < s.length(); j += next) {
                sb.append(s.charAt(i + j));
                if (i != 0 && i != numRows - 1 && j + next - i < s.length()) sb.append(s.charAt(j + next - i));
            }
        }
        return sb.toString();
    }
}