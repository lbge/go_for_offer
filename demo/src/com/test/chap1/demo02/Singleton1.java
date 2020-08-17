package com.test.chap1.demo02;

/**
 * @author Linbo Ge
 * @date 2020/7/9 22:22
 * 饿汉式
 */
public class Singleton1 {
    private Singleton1 singleton1 = new Singleton1();
    private Singleton1() {

    }
    public Singleton1 getInstance(){
        return singleton1;
    }
}

