package Binary_Search;

/**
 * Given two integers dividend and divisor, divide two integers without using multiplication, division and mod operator.
 *
 * Return the quotient after dividing dividend by divisor.
 *
 * The integer division should truncate toward zero.
 *
 * Example:
 *
 * Input: dividend = 10, divisor = 3
 * Output: 3
 *
 * Related Topics: Math, Binary Search
 */

class Divide_Two_Integers {
    public int divide(int dividend, int divisor) {
        int sign = (long)(dividend) * (long)(divisor) < 0 ? -1 : 1;
        long result = sign * divideFunction(Math.abs((long)dividend), Math.abs((long)divisor));
        if (result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int)result;
    }

    private long divideFunction(long dividend, long divisor) {
        long left = 0, right = dividend;
        while (left <= right) {
            long middle = left + (right - left) / 2;
            long multiple = middle * divisor;
            if (multiple == dividend) {
                return middle;
            }else if (multiple < dividend) {
                left = middle + 1;
            }else {
                right = middle - 1;
            }
        }
        return left * divisor > dividend ? left - 1 : left;
    }
}