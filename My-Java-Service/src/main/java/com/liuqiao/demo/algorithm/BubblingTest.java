package com.liuqiao.demo.algorithm;

/**
 * 冒泡排序算法
 * @author wutao
 *
 * 1、要完成总长度为N的数组排序，共计需要进行N-1躺排序
 * 2、第i躺排序需要进行N-1-i次比较
 */
public class BubblingTest {

    public static void main(String[] args) {
        int a[] = {6,3,8,2,9,1};
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        //排序后的数组顺序为
        for (int res : a) {
            System.out.print(" "+res);
        }
    }

}
