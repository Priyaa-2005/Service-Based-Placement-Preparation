/*
============================================================
Problem       : Count and Say
LeetCode No.  : 38
Platform      : LeetCode
Source        : RisingBrain
Topic         : Strings
Pattern       : String Simulation
Difficulty    : Medium
============================================================

Approach:
The sequence starts with "1". For each subsequent term,
count consecutive identical digits in the current string
and build the next string using a StringBuilder.

Steps:
1. Initialize the result as "1".
2. Repeat until the nth term is generated.
3. Count consecutive identical characters.
4. Append the count followed by the character.
5. Return the final generated string.

Time Complexity : O(n × L)
Space Complexity: O(L)

============================================================
*/

class Solution {
    public String countAndSay(int n) {

        String result = "1";

        for (int i = 2; i <= n; i++) {

            StringBuilder current = new StringBuilder();
            int count = 1;

            for (int j = 1; j < result.length(); j++) {

                if (result.charAt(j) == result.charAt(j - 1)) {
                    count++;
                } else {
                    current.append(count);
                    current.append(result.charAt(j - 1));
                    count = 1;
                }
            }

            current.append(count);
            current.append(result.charAt(result.length() - 1));

            result = current.toString();
        }

        return result;
    }
}