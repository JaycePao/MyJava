package com.liuqiao.algorithm.sanlun;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyAtoi {

    public static int myAtoi(String str) {
        str = str.trim();
        if(str.equals("")) return 0;
        Matcher matcher = Pattern.compile("^[+-]?\\d+").matcher(str);
        if(!matcher.find()) return 0;
        String res = matcher.group();
        try {
            return Integer.valueOf(res);
        }catch (Exception e) {
            if(res.charAt(0) == '-') return Integer.MIN_VALUE;
            return Integer.MAX_VALUE;
        }
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("4193 with words"));
    }
}
