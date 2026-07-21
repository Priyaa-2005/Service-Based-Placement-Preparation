/*
============================================================
Problem       : Group Anagrams
LeetCode No.  : 49
Platform      : LeetCode
Source        : RisingBrain
Topic         : Strings
Pattern       : HashMap + Frequency Count
Difficulty    : Medium
============================================================

Approach:
Use a frequency array of size 26 to count the occurrences of
each lowercase letter in every string. Convert the frequency
array into a unique key and use it in a HashMap to group
all anagrams together.

Steps:
1. Create a HashMap to store grouped anagrams.
2. For each string, count the frequency of each character.
3. Build a unique key using the frequency array.
4. Store the string in the corresponding group.
5. Return all grouped anagrams.

Time Complexity : O(n × k)
Space Complexity: O(n × k)

============================================================
*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            int[] freq = new int[26];

            for (char ch : str.toCharArray()) {
                freq[ch - 'a']++;
            }

            StringBuilder key = new StringBuilder();

            for (int count : freq) {
                key.append('#').append(count);
            }

            map.putIfAbsent(key.toString(), new ArrayList<>());
            map.get(key.toString()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}