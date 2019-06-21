package Binary_Search;

/**
 * Implement int sqrt(int x).
 *
 * Compute and return the square root of x, where x is guaranteed to be a non-negative integer.
 *
 * Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.
 *
 * Example:
 *
 * Input: 4
 * Output: 2
 *
 * Related Topics: Math, Binary Search
 */

class Sqrt_x {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        int left = 1, right = x;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (middle == x / middle) {
                return middle;
            }else if (middle < x / middle){
                left = middle + 1;
            }else {
                right = middle - 1;
            }
        }
        return right;
    }
}