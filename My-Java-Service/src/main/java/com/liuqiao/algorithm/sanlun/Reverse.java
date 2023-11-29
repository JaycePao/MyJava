package com.liuqiao.algorithm.sanlun;

/**
 * 整数反转 letcode 7
 */
public class Reverse {

    public static int reverse(int x) {
        int y = 0;
        while (x != 0) {
            if (y > Math.pow(2, 31) || y < -Math.pow(2, 31)) {
                return 0;
            }
            y = y * 10 + x % 10;
            x = x / 10;
        }
        return y;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
    }

}
