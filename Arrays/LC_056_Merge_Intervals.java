
/*
============================================================
Problem       : Merge Intervals
LeetCode No.  : 56
Platform      : LeetCode
Source        : RisingBrain
Topic         : Arrays
Pattern       : Sorting + Interval Merging
Difficulty    : Medium
============================================================

Approach:
1. Sort all intervals based on their starting values.
2. Add the first interval to the result list.
3. Compare each interval with the last merged interval.
4. If the intervals overlap, merge them by updating the ending value.
5. Otherwise, add the current interval to the result list.
6. Convert the list back into a 2D array and return it.

Time Complexity : O(n log n)
Space Complexity: O(n)

============================================================
*/

class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();

        result.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            int[] last = result.get(result.size() - 1);
            int[] current = intervals[i];

            if (current[0] <= last[1]) {
                last[1] = Math.max(last[1], current[1]);
            } else {
                result.add(current);
            }
        }

        return result.toArray(new int[result.size()][]);
    }

