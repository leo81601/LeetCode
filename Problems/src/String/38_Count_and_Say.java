package String;

/**
 * The count-and-say sequence is the sequence of integers with the first five terms as following:
 *
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 *
 * Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence.
 *
 * Note: Each term of the sequence of integers will be represented as a string.
 *
 *
 *
 * Example 1:
 *
 * Input: 1
 * Output: "1"
 * Example 2:
 *
 * Input: 4
 * Output: "1211"
 *
 * Related Topics: String
 */

class Count_and_Say {
    public String countAndSay(int n) {
        int i = 1;
        String result = "1";
        while (i < n) {
            int count = 0;
            StringBuilder sb = new StringBuilder();
            char c = result.charAt(0);
            for (int j = 0; j <= result.length(); j++) {
                if (j != result.length() && result.charAt(j) == c) {
                    count++;
                }else {
                    sb.append(count);
                    sb.append(c);
                    if (j != result.length()) {
                        count = 1;
                        c = result.charAt(j);
                    }
                }
            }
            result = sb.toString();
            i++;
        }
        return result;
    }
}