package Math;

import java.util.ArrayList;
import java.util.List;

/**
 * The set [1,2,3,...,n] contains a total of n! unique permutations.
 *
 * By listing and labeling all of the permutations in order, we get the following sequence for n = 3:
 *
 * "123"
 * "132"
 * "213"
 * "231"
 * "312"
 * "321"
 * Given n and k, return the kth permutation sequence.
 *
 * Note:
 *
 * Given n will be between 1 and 9 inclusive.
 * Given k will be between 1 and n! inclusive.
 *
 * Example:
 *
 * Input: n = 3, k = 3
 * Output: "213"
 *
 * Related Topics: Math, Backtracking
 */

class Permutation_Sequence {
    public String getPermutation(int n, int k) {
        char[] result = new char[n];
        List<Integer> list = new ArrayList<>();
        int[] factorial = new int[n];
        factorial[0] = 1;
        for (int i = 1; i < n; i++) factorial[i] = factorial[i - 1] * i;
        for (int i = 1; i <= n; i++) list.add(i);
        k--;
        for (int i = 0; i < n; i++) {
            result[i] = Character.forDigit(list.remove(k / factorial[n - 1 - i]), 10);
            k = k % factorial[n - 1 - i];
        }
        return new String(result);
    }
}
