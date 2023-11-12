package com.liuqiao.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * letCode 第一题 两数之和，两种解法
 */
public class TwoSum {
    public static void main(String[] args) throws IllegalAccessException {
        System.out.println(Arrays.toString(twoSumSolution2(new int[]{2, 7, 11, 15}, 18)));
    }

//    private static int[] twoSumSolution1(int[] nums, int target) {
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target && j != i) {
//                    System.out.println("i=" + i + " j=" + j);
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return null;
//    }

    private static int[] twoSumSolution2(int[] nums, int target) throws IllegalAccessException {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalAccessException("");
    }
}
