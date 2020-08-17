package com.test.chap1.demo02;

/**
 * @author Linbo Ge
 * @date 2020/7/9 22:32
 */
public class Singleton4 {
    private static class SingletonHolder{
        private static final Singleton4 singleton4 = new Singleton4();
    }
    private Singleton4(){

    }
    public static final Singleton4 getInstance(){
        return Singleton4.getInstance();
    }
}
