package com.test.demo05;

/**
 * @author Linbo Ge
 * @date 2020/6/22 11:29
 */

import java.util.Arrays;

/**
 * 有两个有序的数组A1和A2，A1末尾有足够空间容纳A2。实现一个函数将A2的所有数字插入到A1中，并且所有数字是有序的。
 */
public class Demo2 {

    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 5; i++) {
            a[i] = i * 2 + 1;
        }
        int[] b = {2, 4, 6, 8, 10};
        System.out.println(Arrays.toString(a));
        merge(a,b);
        System.out.println(Arrays.toString(a));
    }

    /**
     * 从末尾开始比较插入，减少移动的次数
     * @param a
     * @param b
     */
    public static void merge(int[] a, int[] b) {
        //计算数组a的长度
        int len = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                len++;
            }
        }

        int pA = len - 1;
        int pB = b.length - 1;
        int k = a.length - 1;

        while (k > 0) {
            if (pA < 0) {
                a[k--] = b[pB--];
            } else if (pB < 0) {
                a[k--] = a[pA--];
            } else if (a[pA] < b[pB]) {
                a[k--] = b[pB--];
            } else {
                a[k--] = a[pA--];
            }
        }
    }
}
