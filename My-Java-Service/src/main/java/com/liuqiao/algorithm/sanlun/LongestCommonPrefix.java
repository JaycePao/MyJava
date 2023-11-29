package com.liuqiao.algorithm.sanlun;

import java.util.Arrays;

/**
 * letcode 14 最长公共前缀
 */
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        Arrays.sort(strs);
        String st = strs[0];
        String en = strs[strs.length - 1];
        int i;
        int num = Math.min(st.length(), en.length());
        for (i = 0; i < num && st.charAt(i) == en.charAt(i); i++) ;
        String res = st.substring(0, i);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"aaa","aa","aaa"}));
    }
}
