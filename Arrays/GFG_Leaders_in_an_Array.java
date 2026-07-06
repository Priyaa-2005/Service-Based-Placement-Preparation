import java.util.ArrayList;
import java.util.Collections;

/*
============================================================
Problem       : Leaders in an Array
Platform      : GeeksforGeeks
Source        : RisingBrain
Topic         : Arrays
Pattern       : Reverse Traversal
Difficulty    : Easy
============================================================

Approach:
1. The last element is always a leader.
2. Traverse the array from right to left.
3. Keep track of the maximum element seen so far.
4. If the current element is greater than or equal to the maximum,
   it is a leader.
5. Reverse the result to restore the original order.

Time Complexity : O(n)
Space Complexity: O(n)

============================================================
*/

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
       
        ArrayList<Integer>ans= new ArrayList<>();
        
         if (arr.length == 0) {
            return ans;
        }
        
        int max = arr[arr.length - 1];
        ans.add(arr[arr.length - 1]);
        
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] >= max) {
                ans.add(arr[i]);
                max = arr[i];
            }
        }
        
        Collections.reverse(ans);
    
        return ans;
    }
}
