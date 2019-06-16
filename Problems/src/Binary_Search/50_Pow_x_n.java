package Binary_Search;

/**
 * Implement pow(x, n), which calculates x raised to the power n (xn).
 *
 * Example:
 *
 * Input: 2.00000, 10
 * Output: 1024.00000
 *
 * Related Topics: Math, Binary Search
 */

class Pow_x_n {
    public double myPow(double x, int n){
        if (n < 0){
            x = 1 / x;
            n = -n;
        }
        return pow(x, n);
    }

    private double pow(double x, int n){
        if (n == 0) return 1;
        double half = pow(x, n / 2);
        if (n % 2 == 0){
            return half * half;
        }else {
            return half * half * x;
        }
    }
}