package com.test.chap2.demo17;

import java.util.Scanner;

/**
 * @author Linbo Ge
 * @date 2020/8/9 20:53
 */
public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        printNums(i);
    }

    private static void printNums(int len) {
        if (len <= 0) {
            return;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < len; i++) {
            sb.append("0");
        }

        printRecur(sb,len,-1);
    }

    private static void printRecur(StringBuilder sb, int len, int index) {

        if (index == len -1){
            print(sb);
            return;
        }
        for (int i = 0; i < 10; i++) {

            sb.setCharAt(index + 1, (char) (i+'0'));
            printRecur(sb,len,index+1);
        }
    }

    private static void print(StringBuilder sb) {
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != '0') {

                System.out.println(sb.substring(i));
                break;
            }
        }
    }
}
