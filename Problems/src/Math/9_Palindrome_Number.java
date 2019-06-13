package Math;

/**
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 *
 * Example:
 *
 * Input: 121
 * Output: true
 *
 * Related Topics: Math
 */

class Palindrome_Number {
    public boolean isPalindrome(int x) {
        int palindrome = 0, initial = x;
        while (x > 0) {
            palindrome = palindrome * 10 + x % 10;
            x /= 10;
        }
        return initial == palindrome;
    }
}