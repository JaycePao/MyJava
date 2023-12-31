package com.liuqiao.algorithm.sanlun;

import java.util.*;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> millionYuanList = new ArrayList<>();
        //人都不够仨，还三胎。。。
        if(nums.length < 3) {
            return millionYuanList;
        }

        Arrays.sort(nums);      //孩子们按个头排好队
        for(int i = 0; i < nums.length; i++) {
            //如果老大都大于0，后面的兄弟肯定都大于0，直接返回就行
            if(nums[i] > 0) break;
            Integer first = nums[i];    //老大出列，站好别动

            //老大想再往后占个位，多领一次奖，这可是不行滴。。。还是回家让妈妈再给生三个小弟弟吧^_^
            if(i > 0 && nums[i] == nums[i - 1]) continue;

            //画个圈，让各家老二在里面呆着
            Set<Integer> set = new HashSet<>();
            for(int j = i + 1; j < nums.length; j++) {
                //老三出列，一会你和老大一块到圈里找老二
                int third = nums[j];
                int second = -(first + third);      //目标是：老大 + 老二 + 老三 = 0
                //找到老二了，记到中奖名单上
                if(set.contains(second)) {
                    millionYuanList.add(new ArrayList<>(Arrays.asList(first, third, -(first + third))));

                    //老三也想多领奖。。。额。。。等会一块回家找妈妈去吧
                    while(j < nums.length - 1 && nums[j] == nums[j + 1]) j++;
                }
                set.add(third);
            }
        }
        return millionYuanList;
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

}
