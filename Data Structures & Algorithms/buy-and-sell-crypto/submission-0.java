class Solution {
    public int maxProfit(int[] prices) {
        int minimum = prices[0];
        int maxProfit = 0;

        for(int price : prices){
            minimum = Math.min(minimum , price);
            int profit = price - minimum;
            maxProfit = Math.max(maxProfit , profit);
        }
        return maxProfit;
    }
}
