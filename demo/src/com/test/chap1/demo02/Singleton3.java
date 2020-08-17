package com.test.chap1.demo02;

/**
 * @author Linbo Ge
 * @date 2020/7/9 22:30
 */
public class Singleton3 {
    private volatile static Singleton3 singleton3;

    private Singleton3(){

    }

    public static Singleton3 getInstance(){
        if (singleton3 == null){
            synchronized (Singleton3.class){
                if (singleton3 == null){
                    singleton3 = new Singleton3();
                }
            }
        }
        return singleton3;
    }
}
