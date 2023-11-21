package com.liuqiao.algorithm.twoLun.Stock;

/**
 * letcode 122
 */
public class StockProfit2 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 1; i < prices.length; i++){
            //只计算正利润
            profit += Math.max(prices[i] - prices[i - 1] , 0);
        }
        return profit;
    }


    public static void main(String[] args) {
        int[] prices = {1, 7, 5, 1,9};
        StockProfit2 stockProfit = new StockProfit2();
        int result = stockProfit.maxProfit(prices);
        System.out.println(result);
    }
}
