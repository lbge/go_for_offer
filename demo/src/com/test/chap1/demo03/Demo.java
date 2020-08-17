package com.test.chap1.demo03;

import java.util.*;

/**
 * @author Linbo Ge
 * @date 2020/6/19 21:13
 */
public class Demo {

    public static void main(String[] args) {
        Demo demo = new Demo();
        int[] a = {2, 6, 0, 5, 4, 1,4 };
        int i = demo.test(a);
//        int i = demo.test02(a);
//        int i = demo.test01(a);
        System.out.println(i);

    }

    /**
     * 排序后查找
     */
    public int test(int[] a) {
        if (a == null || a.length <= 1){
            return -1;
        }

        Arrays.sort(a);
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                return a[i];
            }
        }
        return -1;
    }

    /**
     * 利用hash表
     * @param a
     * @return
     */
    public int test01(int[] a){
        Set<Integer> set = new HashSet<>();
        for (int i : a) {
            if (set.contains(i)){
                return i;
            }else {
                set.add(i);
            }
        }
        return 0;
    }
    /**
     * 交换位置查找
     */

    public int test02(int[] a) {

        for (int i = 0; i < a.length - 1; i++) {
            while (a[i] != i) {
                if (a[i] == a[a[i]]) {
                    return a[i];
                } else {
                    //调换a[i] 和 a[a[i]]
                    swap(a, a[i], i);
                }
            }
        }
        return 0;

    }

    private void swap(int[] a, int p, int q) {
        int i = a[p];
        a[p] = a[q];
        a[q] = i;
    }


}
