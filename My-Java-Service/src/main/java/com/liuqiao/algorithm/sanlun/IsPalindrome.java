package com.liuqiao.algorithm.sanlun;

/**
 * letcode 9 是否是回文数
 */
public class IsPalindrome {
    public static boolean isPalindrome(int x) {
        if(0<=x && x<=9){
            return true;
        }else if(0>x){
            return false;
        }
        String xs = String.valueOf(x);
        StringBuilder sb = new StringBuilder(xs);
        if(sb.reverse().toString().equals(xs)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
    }
}
