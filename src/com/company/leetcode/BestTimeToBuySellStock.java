package com.company.leetcode;

public class BestTimeToBuySellStock {

    public static void main(String[] args) {

        int[] prices = {2,5,1,9,6,7,12};
    }
    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int sell = 0;

        for (int i = 0; i < prices.length; i++) {
            buy = Math.min(prices[i],buy);
            sell = Math.max(sell,prices[i] - buy);
        }

        return sell;
    }
}
