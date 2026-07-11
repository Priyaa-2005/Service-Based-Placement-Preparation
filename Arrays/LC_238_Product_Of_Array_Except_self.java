/*
============================================================
Problem       : Product of Array Except Self
LeetCode No.  : 238
Platform      : LeetCode
Source        : RisingBrain
Topic         : Arrays
Pattern       : Prefix Product + Suffix Product
Difficulty    : Medium
============================================================

Approach:
The idea is to calculate the product of all elements to the left
and right of every index without using division.

Steps:
1. Store the product of all left elements in the answer array.
2. Traverse the array from right to left while maintaining the
   product of elements on the right.
3. Multiply the left product with the right product to get the
   final answer for each index.

Time Complexity : O(n)
Auxiliary Space : O(1)

============================================================
*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }
        int rightProduct = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] = ans[i] * rightProduct;
            rightProduct *= nums[i];
        }

        return ans;
    }
}
