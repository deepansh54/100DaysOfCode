class Solution {
    public int maxProfit(int[] prices, int fee) {
        int minPrice = prices[0];
        int profit = 0;

        for(int i=1; i<prices.length; i++){
            minPrice = Math.min(minPrice,prices[i-1]-profit);
            profit = Math.max(profit, prices[i]-fee-minPrice);
        }
        return profit;

    }
}
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/
