package com.liuqiao.algorithm.twoLun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * letcode 56
 */
public class MergeRegion {

    public static int[][] merge(int[][] intervals) {
        if(intervals.length == 0) {
            return new int[0][2];
        }
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));

        List<int[]> merged = new ArrayList<>();

        for (int i=0; i<intervals.length; i++) {
            int left = intervals[i][0];
            int right = intervals[i][1];
            if (merged.size() == 0 || merged.get(merged.size() - 1)[1] < left) {
                merged.add(new int[]{left,right});
            } else {
                merged.get(merged.size()-1)[1] = Math.max(merged.get(merged.size() -1)[1], right);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[] intArr1 = new int[]{1, 3};
        int[] intArr2 = new int[]{2,6};
        int[] intArr3 = new int[]{8,10};
        int[] intArr4 = new int[]{15,18};
        int[][] intervals = new int[][]{intArr4, intArr2, intArr3, intArr1};
        int[][] mergeInt = merge(intervals);


        for (int i=0; i< mergeInt.length; i++) {
            for (int j=0; j<mergeInt[i].length; j++) {
                System.out.print(mergeInt[i][j] + " ");
            }
            System.out.println();
        }
    }
}
