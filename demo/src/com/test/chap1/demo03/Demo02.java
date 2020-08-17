package com.test.chap1.demo03;

/**
 * @author Linbo Ge
 * @date 2020/6/19 22:03
 */
public class Demo02 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 3, 2, 6, 7};
        Demo02 demo02 = new Demo02();
        int i = demo02.test(arr);
        System.out.println(i);

    }

    public int test(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (b[a[i]] != 0) {
                return a[i];
            } else {
                b[a[i]] = a[i];
            }
        }
        return 0;
    }

    public int test01(int[] a) {

        return -1;
    }


}
