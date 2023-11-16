package com.liuqiao.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * letcode 496 下一个更大元素
 */
public class NextGreatElement {
    public static int[] solution(int[] findNums, int[] allNums) {
        if(findNums == null || findNums.length == 0 || allNums == null || allNums.length == 0) {
            return new int[]{};
        }

        int[] result = new int[findNums.length];
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<allNums.length; i++) {
            while(!stack.empty() && allNums[i] > stack.peek()) {
                map.put(stack.pop(), allNums[i]);
            }
            stack.push(allNums[i]);
        }

        for(int j=0; j<findNums.length; j++) {
            result[j] = map.getOrDefault(findNums[j], -1);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{2, 3}, new int[]{1, 2, 3, 4})));
    }
}
