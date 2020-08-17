package com.test.chap2.demo17;

import java.util.Scanner;

/**
 * @author Linbo Ge
 * @date 2020/8/9 20:51
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        printNums(i);
    }

    private static void printNums(int len) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < len; i++) {
            sb.append("0");
        }

        while (stillIncrease(sb, len)) {
            print(sb);
        }

    }

    private static boolean stillIncrease(StringBuilder sb, int len) {
        int token = 0;
        for (int i = len - 1; i >= 0; i--) {
            int sum = sb.charAt(i) - '0' + token;

            if (i == len - 1) {
                sum++;
            }

            if (sum == 10) {
                if (i == 0) {
                    return false;
                } else {
                    sb.setCharAt(i, '0');
                    token = 1;
                }
            } else {
                sb.setCharAt(i, (char) (sum + '0'));
                break;
            }

        }
        return true;
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
