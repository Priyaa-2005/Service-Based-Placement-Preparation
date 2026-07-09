/*
============================================================
Problem       : Trapping Rain Water
LeetCode No.  : 42
Platform      : LeetCode
Source        : RisingBrain
Topic         : Arrays
Pattern       : Two Pointers
Difficulty    : Hard
============================================================

Approach:
The idea is to use two pointers while maintaining the maximum
height seen from both the left and right sides. At every step,
move the pointer pointing to the smaller height because the
amount of trapped water depends on the shorter boundary.

Steps:
1. Initialize two pointers at the beginning and end of the array.
2. Maintain the maximum height encountered from the left and right.
3. Move the pointer with the smaller height inward.
4. If the current height is smaller than the corresponding maximum,
   add the trapped water at that position.
5. Continue until both pointers meet.

Time Complexity : O(n)
Space Complexity: O(1)

============================================================
*/

class Solution {
    public int trap(int[] height) {

        if (height == null || height.length == 0)
            return 0;

        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int trappedWater = 0;

        while (left < right) {

            if (height[left] < height[right]) {

                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    trappedWater += leftMax - height[left];
                }

                left++;

            } else {

                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    trappedWater += rightMax - height[right];
                }

                right--;
            }
        }

        return trappedWater;
    }
}