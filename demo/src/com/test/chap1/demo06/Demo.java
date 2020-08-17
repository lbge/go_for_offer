package com.test.chap1.demo06;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author Linbo Ge
 * @date 2020/6/22 14:25
 */
public class Demo {

    public static void main(String[] args) {

    }

    public class FromTail2Head {
        // 节点类的定义
        private class ListNode {
            int val;
            ListNode next = null;

            ListNode(int val) {
                this.val = val;
            }
        }

        /**
         * 更推荐使用栈，正序压入，尾节点就在最前面了
         *
         * @param listNode 链表的头结点
         * @return 从尾到头排列的结点
         */
        public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
            LinkedList<Integer> stack = new LinkedList<>();
            for (ListNode node = listNode; node != null; node = node.next) {
                stack.push(node.val);
            }
            return new ArrayList<>(stack);
        }
    }
}
