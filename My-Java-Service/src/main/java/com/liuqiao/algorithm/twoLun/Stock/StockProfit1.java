package com.liuqiao.algorithm.twoLun.Stock;

/**
 * letcode 121
 */
public class StockProfit1 {
    public static int solution(int[] prices) {
        int[][] dp = new int[prices.length][2];
        dp[0][0] = dp[0][0] - prices[0];
        dp[0][1] = 0;
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], -prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], prices[i] + dp[i - 1][0]);
        }
        return dp[prices.length - 1][1];
    }


    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = solution(prices);
        System.out.println(result);
    }
}
