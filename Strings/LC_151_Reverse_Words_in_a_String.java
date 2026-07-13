/*
============================================================
Problem       : Reverse Words in a String
LeetCode No.  : 151
Platform      : LeetCode
Source        : RisingBrain
Topic         : Strings
Pattern       : String Manipulation
Difficulty    : Medium
============================================================

Approach:
The idea is to remove extra spaces, split the string into words,
and traverse the array in reverse order to build the final string.

Steps:
1. Remove leading, trailing, and multiple spaces.
2. Split the string into individual words.
3. Traverse the words array from the end.
4. Append each word to a StringBuilder.
5. Return the final string.

Time Complexity : O(n)
Space Complexity: O(n)

============================================================
*/

class Solution {
    public String reverseWords(String s) {

        s = s.trim().replaceAll("\\s+", " ");
        String[] words = s.split(" ");

        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);

            if (i != 0) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}