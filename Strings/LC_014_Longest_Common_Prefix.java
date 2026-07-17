/*
============================================================
Problem       : Longest Common Prefix
LeetCode No.  : 14
Platform      : LeetCode
Source        : RisingBrain
Topic         : Strings
Pattern       : Horizontal Scanning
Difficulty    : Easy
============================================================

Approach:
The idea is to compare characters of all strings one by one
using the first string as a reference.

Steps:
1. Handle the edge case where the input array is null or empty.
2. Traverse each character of the first string.
3. Compare the current character with the corresponding character
   of every other string.
4. If a mismatch is found or a string ends, return the substring
   from index 0 to the current position.
5. If all characters match, return the first string as the
   longest common prefix.

Time Complexity : O(n × m)
Space Complexity: O(1)

============================================================
*/

class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        for (int i = 0; i < strs[0].length(); i++) {

            char ch = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {

                if (i == strs[j].length() || strs[j].charAt(i) != ch) {
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0];
    }
}