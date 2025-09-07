// 212 / 212 test cases passed.
// Status: Accepted
// Runtime: 2 ms
// Memory Usage: 61.9 MB

class Solution {
    public int maxProfit(int[] prices) {
       int minPrice = prices[0];
       int maxProfit = 0;
       for(int i = 0 ; i < prices.length ; i++){
        if(prices[i] < minPrice){
            minPrice = prices[i];
        }else if (prices[i] - minPrice > maxProfit){
            maxProfit = prices[i] - minPrice;
        }
       }
       return maxProfit;
    }
}
