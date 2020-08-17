package com.test.chap1.demo05;

/**
 * @author Linbo Ge
 * @date 2020/6/22 10:07
 */
public class Demo {

    public static void main(String[] args) {

        String s = "You are the best!";
        String s1 = replaceSpace(s);
        System.out.println(s1);
    }
    //需要新的空间，原题要求不改变输入数据类型String

    public static String replaceSpace(String s) {
        int spaceNum = 0;

        if (s == null) {
            return null;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                spaceNum++;
            }
        }
        int length = s.length() + spaceNum * 2;
        char[] result = new char[length];
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                result[start++] = '%';
                result[start++] = '2';
                result[start++] = '0';
            } else {
                result[start++] = s.charAt(i);
            }
        }
        return String.valueOf(result);
    }
}


