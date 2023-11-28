package com.liuqiao.algorithm.sanlun;

/**
 * letcode 134 加油站 ,贪心算法
 */
public class CanCompleteCircuit {
    public static int solution(int[] gas, int cost[]) {
        int start = 0,currentSum = 0,totalSum = 0;
        for (int i=0; i<gas.length; i++) {
            totalSum += gas[i] - cost[i];
            currentSum += gas[i] - cost[i];
            if (currentSum < 0) {
                start = i + 1;
                currentSum = 0;
            }
        }
        if (totalSum < 0) {
            return -1;
        }
        return start;
    }

    public static void main(String[] args) {
        // System.out.println(solution(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}));
        System.out.println(solution(new int[]{2, 3, 4}, new int[]{3, 4, 3}));
    }

}
