package com.liuqiao.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * letcode 496 下一个更大元素
 */
public class NextGreatElement {
    public static int[] nextGreaterElement(int[] findNums, int[] nums) {
        if (findNums == null || nums == null || findNums.length == 0 || nums.length == 0){
            return new int[]{};
        }

        int[] res = new int[findNums.length];

        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            // 如果当前元素大于栈顶的元素
            while (!stack.empty() && nums[i] > stack.peek()){
                // 剔除栈顶元素，并将改元素放入map中，以栈顶的元素以及当前元素作为k&v
                map.put(stack.pop(), nums[i]);
            }
            // 把大数组的元素放入栈中
            stack.push(nums[i]);
        }

        for (int i = 0; i < findNums.length; i++){
            res[i] = map.getOrDefault(findNums[i], -1);
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextGreaterElement(new int[]{2, 4, 5}, new int[]{1, 2, 3, 4})));
    }

}
