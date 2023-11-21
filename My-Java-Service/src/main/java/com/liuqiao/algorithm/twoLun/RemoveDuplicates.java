package com.liuqiao.algorithm.twoLun;

/**
 * letcode 26
 */
public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 3};
        int result = removeDuplicates(intArr);
        System.out.println(result);
    }
}
