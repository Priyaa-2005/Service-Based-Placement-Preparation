/*
============================================================
Problem       : Rotate Array
LeetCode No.  : 189
Platform      : LeetCode
Source        : RisingBrain
Topic         : Arrays
Pattern       : Array Rotation
Difficulty    : Medium
============================================================

Approach:
1. Reduce k using modulo operation.
2. Create an auxiliary array.
3. Place every element at its rotated position.
4. Copy the rotated array back to the original array.

Time Complexity : O(n)
Space Complexity: O(n)

============================================================
*/

class Solution {
    public void rotate(int[] nums, int k) {
        
       int n=nums.length;
       k = k % n;
       int[] arr = new int[n];
       for(int i=0; i<n; i++){
        arr[(i + k) % n] = nums[i];

       }
       for(int i=0; i<n; i++){
        nums[i] = arr[i];

       }

            
        
    }
}

/*
This solution uses an auxiliary array.

A more optimized approach is the Reverse Algorithm,
which achieves O(1) extra space.
*/