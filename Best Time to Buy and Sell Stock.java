class Solution {
    public int maxProfit(int[] prices) {
        int sell = 0, profit = 0;
        for(int i = 1; i < prices.length; i++) {
            sell = Math.max(0, sell += prices[i] - prices[i-1]);
            profit = Math.max(sell, profit);
        }
        return profit;
    }
}