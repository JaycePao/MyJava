package com.liuqiao.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wutao
 * from leetcode
 * 每趟类积除自己
 */
public class ProductExceptSelf {



    public static void main(String[] args) {

        List<String> arrList = new ArrayList<String>();
        arrList.add("a");
        arrList.add("b");

        List<String> list = arrList.subList(0, 1);


        int[] arr = new int[]{1, 2, 3, 4};

        int[] arr2 = productExceptSelf(arr);

        for (int j=0; j<arr2.length; j ++) {
            System.out.print(arr2[j] + ",");
        }
    }

    public static int[] productExceptSelf(int[] arrIn) {

        for (int j=0; j<arrIn.length; j ++) {
            System.out.print(arrIn[j] + ",");
        }

        int[] arrOut = new int[arrIn.length];

        // 分为3种情况
        // 有1个零 有两个零 没有零

        int m = 1; // 积累计

        int zeroCount = 0; //数组中零的个数

        for(int i = 0;i<arrIn.length;i++) {
            if(arrIn[i] == 0) {
                zeroCount ++;
                continue;
            }

            m *= arrIn[i];
        }

        if(zeroCount >1) {
            return arrOut;  // 假如有两个零以上（包括两个零），则可以直接返回，结果数组中所有元素都必为0
        }

        for(int i = 0;i<arrIn.length;i++) {
            if(zeroCount ==1) { // 有一个零或没有零的判断
                if(arrIn[i] == 0) {
                    arrOut[i] = m;
                } else {
                    arrOut[i] = 0;
                }
            } else {
                arrOut[i] = m/arrIn[i];
            }
        }

        return arrOut;

    }

}
