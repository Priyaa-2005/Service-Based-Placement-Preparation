/*
============================================================
Problem       : String to Integer (atoi)
LeetCode No.  : 8
Platform      : LeetCode
Source        : RisingBrain
Topic         : Strings
Pattern       : String Parsing
Difficulty    : Medium
============================================================

Approach:
The idea is to parse the string step by step while following
the atoi conversion rules.

Steps:
1. Skip leading whitespaces.
2. Check for an optional '+' or '-' sign.
3. Read consecutive digits.
4. Check for integer overflow before updating the result.
5. Return the final integer with the correct sign.

Time Complexity : O(n)
Space Complexity: O(1)

============================================================
*/

class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int n = s.length();
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        if (i == n) {
            return 0;
        }
        int sign = 1;
        if (s.charAt(i) == '+') {
            i++;
        } else if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        }

        int result = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }
}
