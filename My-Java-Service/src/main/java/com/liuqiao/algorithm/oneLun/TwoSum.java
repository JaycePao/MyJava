package com.liuqiao.algorithm.oneLun;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * letCode 第一题 两数之和，两种解法
 */
public class TwoSum {
    public static int[] solution(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int I =0; I< nums.length; I++) {
            int complement = target - nums[I];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), I};
            }
            map.put(nums[I], I);
        }
        return null;
    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4}, 7)));
    }
}
