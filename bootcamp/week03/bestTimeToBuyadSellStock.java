package com.company;

public class bestTimeToBuyadSellStock {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        for(int i =0;i<prices.length-1;i++){
            int diff = prices[i+1]-prices[i];
            if(diff>0){
                max_profit = max_profit+diff;
            }
        }
        return max_profit;
    }
}
