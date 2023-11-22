package com.liuqiao.algorithm.twoLun;

import java.util.Arrays;

/**
 * letcode 378
 * 有限矩阵中第k小的元素
 */
public class KthSmallest {
    public static int solution(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] sorted = new int[m * n];
        int index = 0;
        for (int[] intArr : matrix) {
            for (int item : intArr) {
                sorted[index] = item;
                index++;
            }
        }

        Arrays.sort(sorted);
        return sorted[k - 1];
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
        int result = solution(matrix, 6);
        System.out.println(result);
    }
}
