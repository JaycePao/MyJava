package com.liuqiao.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * letCode 第一题 两数之和，两种解法
 */
public class TwoSum {

    public static int[] solution(int[] nums, int target) throws IllegalAccessException {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;  i<nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalAccessException("");
    }

    public static void main(String[] args) throws IllegalAccessException {
        int[] nums = new int[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(solution(nums, 5)));
    }
}
