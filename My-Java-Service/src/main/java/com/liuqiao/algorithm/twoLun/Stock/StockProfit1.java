package com.liuqiao.algorithm.twoLun.Stock;

/**
 * letcode 121
 *
 * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
 */
public class StockProfit1 {
    public static int solution(int[] prices) {
        if (prices.length < 1) {
            return 0;
        }

        int minPrice = prices[0];
        int maxProfit = 0 ;
        for (int i=1; i<prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            int currentProfit = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, currentProfit);
        }

        return maxProfit;
    }


    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = solution(prices);
        System.out.println(result);
    }
}
