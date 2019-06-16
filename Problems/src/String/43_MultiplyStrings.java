package String;

/**
 * Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.
 *
 * Example:
 *
 * Input: num1 = "2", num2 = "3"
 * Output: "6"
 *
 * Related Topics: Math, String
 */

class Multiply_Strings {
    public String multiply(String num1, String num2) {
        int len1 = num1.length(), len2 = num2.length();
        int[] position = new int[len1 + len2];
        for (int i = len1 - 1; i >= 0; i--) {
            for (int j = len2 - 1; j >= 0; j--) {
                int multiple = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j, p2 = i + j + 1;
                int sum = position[p2] + multiple;
                position[p1] += sum / 10;
                position[p2] = sum % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int p : position) {
            if (sb.length() == 0 && p == 0) continue;
            sb.append(p);
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}