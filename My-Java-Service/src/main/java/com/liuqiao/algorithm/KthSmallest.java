package com.liuqiao.algorithm;

import java.util.Arrays;

public class KthSmallest {
    public static int kthSmallest(int[][] matrix, int k) {
        int rows = matrix.length, columns = matrix[0].length;
        int[] sorted = new int[rows * columns];
        int index = 0;

        //将二维数组另存为为一维数组
        for (int[] row : matrix) {
            for (int num : row) {
                sorted[index++] = num;
            }
        }
        //排序
        Arrays.sort(sorted);

        return sorted[k - 1];
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,5,9},{10,11,13},{12,13,15}};
        int result = kthSmallest(matrix, 6);
        System.out.println(result);
    }
}
