package com.liuqiao.algorithm.twoLun.Stock;

/**
 * letcode 122
 */
public class StockProfit2 {
    public static int solution(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            //只计算正利润
            profit += Math.max(prices[i] - prices[i - 1], 0);
        }
        return profit;
    }


    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = solution(prices);
        System.out.println(result);
    }
}
