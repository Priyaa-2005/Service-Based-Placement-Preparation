/*
============================================================
Problem       : Contains Duplicate
LeetCode No.  : 217
Platform      : LeetCode
Source        : RisingBrain
Topic         : Arrays
Pattern       : HashSet
Difficulty    : Easy
============================================================

Approach:
Use a HashSet to store visited elements while traversing
the array. If the current element already exists in the
HashSet, a duplicate is found and return true.
Otherwise, add the element to the HashSet.

Steps:
1. Create an empty HashSet.
2. Traverse the array.
3. If the element already exists in the set, return true.
4. Otherwise, add it to the set.
5. If no duplicates are found, return false.

Time Complexity : O(n)
Space Complexity: O(n)

============================================================
*/
import java.util.*;
class Solution {

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {

            if (set.contains(num)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }
}
