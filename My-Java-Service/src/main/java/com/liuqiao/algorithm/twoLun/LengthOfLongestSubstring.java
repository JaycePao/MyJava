package com.liuqiao.algorithm.twoLun;

/**
 *
 * letcode 3
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 示例1：
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 *
 * 示例2：
 * 输入: s = "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 *
 * 示例3：
 * 输入: s = "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *
 * 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 *
 * @author wutao
 * @since  2023-04-08
 */
public class LengthOfLongestSubstring {
    public static int solution(String s) {
        // 记录字符上一次出现的位置
        int[] last = new int[128];
        for(int i = 0; i < 128; i++) {
            last[i] = -1;
        }
        int n = s.length();
        int result = 0;
        int start = 0; // 窗口开始位置
        for(int i = 0; i < n; i++) {
            int index = s.charAt(i);
            start = Math.max(start, last[index] + 1);
            result = Math.max(result, i - start + 1);
            last[index] = i;
        }

        return result;
    }

    public static void main(String[] args) {
        int result = solution("abcabcbb");
        System.out.println(result);
    }
}
