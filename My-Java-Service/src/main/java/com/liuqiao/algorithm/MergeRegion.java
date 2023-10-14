package com.liuqiao.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeRegion {

    public static int[][] merge(int[][] intervals) {
        if(intervals.length == 0) {
            return new int[0][2];
        }

        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] interval1, int[] interval2) {
                return interval1[0] - interval2[0];
            }
        });

        List<int[]> merged = new ArrayList<>();

        for (int i=0; i<intervals.length; i++) {
            int L = intervals[i][0];
            int R = intervals[i][1];
            if (merged.size() == 0 || merged.get(merged.size() - 1)[1] < L) {
                merged.add(new int[]{L,R});
            } else {
                merged.get(merged.size()-1)[1] = Math.max(merged.get(merged.size() -1)[1], R);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[] intArr1 = new int[]{1, 3};
        int[] intArr2 = new int[]{2,6};
        int[] intArr3 = new int[]{8,10};
        int[] intArr4 = new int[]{15,18};

        int[][] intervals = new int[][]{intArr1, intArr2, intArr3, intArr4};
        System.out.println(intervals[0][1]);


        System.out.println(merge(intervals));
    }
}
