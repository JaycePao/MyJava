package com.liuqiao.algorithm.twoLun.Stock;

/**
 * letcode 123
 */
public class StockProfit3 {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        // f[i]表示以i为分界点，左半段交易一次的最大金额
        int[] f = new int[n+1];
        for(int i = 1,minp = Integer.MAX_VALUE; i <= n;i++){
            // 当前价格减去左半段中的价格最小值为这天能赚的做多的利润
            f[i] = Math.max(f[i-1],prices[i-1]-minp);
            // 保存左半段中的价格最小值
            minp = Math.min(minp,prices[i-1]);
        }

        // 遍历整个数组，以i为分界点，在遍历时计算右半段的最大值，并根据f[i]求出答案
        int res = 0;
        // maxp为右半段的价格最大值
        for(int i = n,maxp = 0;i >= 1;i--){
            // 右半段的价格最大值减去当天的价格为右半段一次交易能获得的最大利润
            res = Math.max(res,maxp - prices[i - 1] + f[i - 1]);
            maxp = Math.max(maxp,prices[i - 1]);
        }
        return res;
    }


    public static void main(String[] args) {
        int[] prices = {1, 7, 5, 1, 9};
        StockProfit3 stockProfit = new StockProfit3();
        int result = stockProfit.maxProfit(prices);
        System.out.println(result);
    }
}
