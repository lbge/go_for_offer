package com.test.demo03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Linbo Ge
 * @date 2020/6/19 21:13
 */
public class Demo {

    public static void main(String[] args) {
        Demo demo = new Demo();
        int[] a = {2, 6, 0, 5, 4, 1,4 };
       /* List<Integer> list = demo.test(a);

        System.out.println(list);*/
        int i = demo.test02(a);
        System.out.println(i);

    }

    /**
     * 排序后查找
     */
    public List<Integer> test(int[] a) {
        List<Integer> list = new ArrayList<>();

        Arrays.sort(a);
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                list.add(a[i]);
            }
        }
        return list;
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
