package Backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * The gray code is a binary numeral system where two successive values differ in only one bit.
 *
 * Given a non-negative integer n representing the total number of bits in the code, print the sequence of gray code. A gray code sequence must begin with 0.
 *
 * Example 1:
 *
 * Input: 2
 * Output: [0,1,3,2]
 * Explanation:
 * 00 - 0
 * 01 - 1
 * 11 - 3
 * 10 - 2
 *
 * For a given n, a gray code sequence may not be uniquely defined.
 * For example, [0,2,3,1] is also a valid gray code sequence.
 *
 * 00 - 0
 * 10 - 2
 * 11 - 3
 * 01 - 1
 *
 * Related Topics: Backtracking
 */

class Gray_Code {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        int len = 1 << n;
        for (int i = 0; i < len; i++) {
            result.add(i ^ (i >> 1));
        }
        return result;
    }
}