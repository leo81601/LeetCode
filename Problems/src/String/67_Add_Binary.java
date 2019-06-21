package String;

/**
 * Given two binary strings, return their sum (also a binary string).
 *
 * The input strings are both non-empty and contains only characters 1 or 0.
 *
 * Example:
 *
 * Input: a = "11", b = "1"
 * Output: "100"
 *
 * Related Topics: Math, String
 */

class Add_Binary {
    public String addBinary(String a, String b) {
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i) - '0';
            if (j >= 0) sum += b.charAt(j) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
            i--;
            j--;
        }
        if (carry != 0) sb.append("1");
        return sb.reverse().toString();
    }
}