/*
============================================================
Problem       : Maximum Subarray
LeetCode No.  : 53
Platform      : LeetCode
Source        : RisingBrain
Topic         : Arrays
Pattern       : Kadane's Algorithm
Difficulty    : Medium
============================================================

Approach:
1. Traverse the array while maintaining a running sum.
2. Update the maximum sum whenever a larger sum is found.
3. If the running sum becomes negative, reset it to 0 because
   it cannot contribute to a larger subarray in the future.

Time Complexity : O(n)
Space Complexity: O(1)

============================================================
*/

class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            maxSum = Math.max(maxSum, sum);

            if (sum < 0) {
                sum = 0;
            }
        }

        return maxSum;
    }
}