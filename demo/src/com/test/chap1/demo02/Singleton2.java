package com.test.chap1.demo02;

/**
 * @author Linbo Ge
 * @date 2020/7/9 22:24
 * 饱汉式
 */
public class Singleton2 {
    private Singleton2 singleton2 = null;

    private Singleton2() {
    }

    public Singleton2 getInstance() {
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}

