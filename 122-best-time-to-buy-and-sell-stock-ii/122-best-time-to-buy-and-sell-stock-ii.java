class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        int n = prices.length;
        for(int i=0;i<n-1;i++){
            if(prices[i+1]-prices[i]>0){
                max_profit  = max_profit + prices[i+1]-prices[i];
            }
        }
        
        return max_profit;
    }
}