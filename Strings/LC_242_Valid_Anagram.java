

/*
============================================================
Problem       : Valid Anagram
LeetCode No.  : 242
Platform      : LeetCode
Source        : RisingBrain
Topic         : Strings
Pattern       : Sorting
Difficulty    : Easy
============================================================

Approach:
The idea is to sort both strings and compare them.

Steps:
1. If the lengths are different, return false.
2. Convert both strings into character arrays.
3. Sort both arrays.
4. Compare the sorted arrays.
5. If both arrays are equal, the strings are anagrams.

Time Complexity : O(n log n)
Space Complexity: O(n)

============================================================
*/

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);
    }
}
