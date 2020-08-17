package com.test.chap1.demo09;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Linbo Ge
 * @date 2020/6/23 14:51
 */
public class TwoQueueImpStack {
    private Queue<Integer> a;
    private Queue<Integer> another;

    public TwoQueueImpStack() {
        this.a = new LinkedList<>();
        this.another = new LinkedList<>();
    }

    public void push(int node) {
        //进入不为空的那个队列中
        if (a.isEmpty()&&another.isEmpty()){
            a.offer(node);//插入元素
        }else if (!a.isEmpty()){
            a.offer(node);
        }else {
            another.offer(node);
        }
    }

    public int pop(){
        if (a.isEmpty()&&another.isEmpty()){
            return -1;
        }

        if (!another.isEmpty()){
            int size  = another.size();
            for (int i = 0; i < size - 1; i++) {
                a.offer(another.poll());
            }
            return another.poll();
        }else {
            int size = a.size();
            for (int i = 0; i < size - 1; i++) {
                another.offer(a.poll());
            }
            return a.poll();
        }
    }

    public static void main(String[] args) {
        TwoQueueImpStack a = new TwoQueueImpStack()
                ;
        a.push(34);
        a.push(53);
        a.push(67);
        System.out.println(a.pop());
        System.out.println(a.pop());
        a.push(11);
        a.push(44);
        System.out.println(a.pop());
    }
}
