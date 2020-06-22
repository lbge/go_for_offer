package com.test.demo04;

/**
 * @author Linbo Ge
 * @date 2020/6/19 22:13
 */
public class Demo {
    /**
     * 从右上角元素开始作比较进行删减
     * @param array
     * @param target
     * @return
     */
    boolean find(int[][] array, int target) {
        if (array != null && array.length > 0) {


            int M = array.length;
            //右上角行数
            int m = 0;
            //右上角列数
            int n = array[0].length - 1;
            while (m < M && n >= 0) {
                if (target > array[m][n]) {
                    m++;
                } else if (target < array[m][n]) {
                    n--;
                } else {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
