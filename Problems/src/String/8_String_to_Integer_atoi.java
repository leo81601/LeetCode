package String;

/**
 Implement atoi which converts a string to an integer.

 The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.

 The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.

 If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.

 If no valid conversion could be performed, a zero value is returned.

 Related Topics: Math, String
 */

class String_to_Integer_atoi {
    public int myAtoi(String str) {
        str = str.trim();
        if (str.isEmpty()) return 0;
        int sign = 1, index = 0;
        long result = 0;
        while (str.charAt(index) == ' ') index++;
        if (str.charAt(index) == '+' || str.charAt(index) == '-') {
            sign = str.charAt(index) == '+' ? 1 : -1;
            index++;
        }
        while (index < str.length() && str.charAt(index) >= '0' && str.charAt(index) <= '9') {
            result = result * 10 + str.charAt(index) - '0';
            if (sign == 1 && result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign == -1 && -1 * result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            index++;
        }
        return (int)result * sign;
    }
}