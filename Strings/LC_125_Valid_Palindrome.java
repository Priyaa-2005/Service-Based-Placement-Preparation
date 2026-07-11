/*
============================================================
Problem       : Valid Palindrome
LeetCode No.  : 125
Platform      : LeetCode
Source        : RisingBrain
Topic         : Strings
Pattern       : Two Pointers
Difficulty    : Easy
============================================================

Approach:
The idea is to use two pointers starting from both ends of the
string. Ignore all non-alphanumeric characters and compare the
remaining characters in a case-insensitive manner.

Steps:
1. Initialize two pointers at the beginning and end.
2. Skip non-alphanumeric characters.
3. Compare characters after converting them to lowercase.
4. If they differ, return false.
5. Continue until both pointers meet.

Time Complexity : O(n)
Space Complexity: O(1)

============================================================
*/

class Solution {
    public boolean isPalindrome(String s) {

        int l = 0;
        int r = s.length() - 1;

        while (l < r) {

            char left = s.charAt(l);
            char right = s.charAt(r);

            if (!Character.isLetterOrDigit(left)) {
                l++;
            }
            else if (!Character.isLetterOrDigit(right)) {
                r--;
            }
            else if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
                return false;
            }
            else {
                l++;
                r--;
            }
        }

        return true;
    }
}
 

