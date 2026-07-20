/*
============================================================
Problem       : Longest Substring Without Repeating Characters
LeetCode No.  : 3
Platform      : LeetCode
Source        : RisingBrain
Topic         : Strings
Pattern       : Sliding Window + HashSet
Difficulty    : Medium
============================================================

Approach:
Use a sliding window to maintain a substring with unique
characters. Expand the window using the right pointer.
If a duplicate character is found, shrink the window
from the left until the duplicate is removed.
Track the maximum window size throughout the process.

Time Complexity : O(n)
Space Complexity: O(min(n, m))

============================================================
*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
         Set<Character> set = new HashSet<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
