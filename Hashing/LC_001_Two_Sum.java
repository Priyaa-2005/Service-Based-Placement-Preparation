/*
============================================================
Problem       : Two Sum
LeetCode No.  : 1
Platform      : LeetCode
Source        : RisingBrain
Topic         : Arrays
Pattern       : HashMap
Difficulty    : Easy
============================================================

Approach:
Use a HashMap to store each number and its index while
traversing the array. For every element, calculate its
complement (target - current element). If the complement
already exists in the HashMap, return the stored index
and the current index.

Steps:
1. Create a HashMap to store numbers and their indices.
2. Traverse the array.
3. Compute the complement.
4. If the complement exists in the map, return both indices.
5. Otherwise, store the current number and its index.
6. If no pair is found, return an empty array.

Time Complexity : O(n)
Space Complexity: O(n)

============================================================
*/
import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        return new int[] {};
    }
}