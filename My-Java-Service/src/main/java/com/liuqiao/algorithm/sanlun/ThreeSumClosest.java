package com.liuqiao.algorithm.sanlun;

import java.util.Arrays;

/**
 * 最接近的三数之和 letcode16
 */
public class ThreeSumClosest {
    public static int solution(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length, res = 0, near = (int) 1e9;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1, k = n - 1; j < k; ) {
                int sum = nums[i] + nums[j] + nums[k];
                if (near > Math.abs(target - sum)) {
                    near = Math.abs(target - sum);
                    res = sum;
                }
                if (sum > target) {
                    --k;
                } else if (sum < target) {
                    ++j;
                } else {
                    return target;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{-1,2,1,-4}, 1));
    }


}
