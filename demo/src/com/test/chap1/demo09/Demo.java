package com.test.chap1.demo09;

import java.util.LinkedList;

/**
 * @author Linbo Ge
 * @date 2020/6/23 10:49
 */
public class Demo {


    private LinkedList<Integer> stack1 = new LinkedList<>();
    private LinkedList<Integer> stack2 = new LinkedList<>();

    public void appendTail(int val){
        stack1.push(val);
    }

    public int deleteHead(){
        if(stack1.isEmpty()&&stack2.isEmpty()){
            return -1;
        }
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }


}
