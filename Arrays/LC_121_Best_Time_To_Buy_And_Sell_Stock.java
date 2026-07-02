/*
============================================================
Problem       : Best Time to Buy and Sell Stock
LeetCode No.  : 121
Platform      : LeetCode
Source        : RisingBrain
Topic         : Arrays
Difficulty    : Easy
============================================================

Approach:
1. Keep track of the minimum stock price encountered so far.
2. Calculate the profit if the stock is sold on the current day.
3. Update the maximum profit whenever a higher profit is found.

Time Complexity : O(n)
Space Complexity: O(1)

============================================================
*/


class Solution {
    public int maxProfit(int[] prices) {
        int minPrice =prices[0];
        int maxProfit=0;
        for(int i =1;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice = prices[i];
            }
            int profit = prices[i]-minPrice;
            if(profit>maxProfit){
                maxProfit = profit;
            }
        }
        return maxProfit;
        
    }
}