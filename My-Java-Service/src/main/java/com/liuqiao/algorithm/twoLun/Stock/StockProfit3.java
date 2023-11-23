package com.liuqiao.algorithm.twoLun.Stock;

/**
 * letcode 123
 * 两次买卖可以获得的最大利润
 *
 */
public class StockProfit3 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] leftProFit = new int[n];
        int[] rightProfit = new int[n];

        for (int i = 1, minPrice = prices[0]; i < n; i++) {
            leftProFit[i] = Math.max(leftProFit[i - 1], prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }

        for (int i = n - 2, maxPrice = prices[n - 1]; i >= 0; i--) {
            rightProfit[i] = Math.max(rightProfit[i+1], maxPrice - prices[i]);
            maxPrice = Math.max(maxPrice, prices[i]);
        }

        int result = 0;
        for (int i=0; i<n; i++) {
            result = Math.max(result, leftProFit[i] + rightProfit[i]);
        }

        return result;
    }


    public static void main(String[] args) {
        int[] prices = {1, 7, 5, 1, 9};
        StockProfit3 stockProfit = new StockProfit3();
        int result = stockProfit.maxProfit(prices);
        System.out.println(result);
    }
}
