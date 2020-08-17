package com.test.chap1.demo06;

/**
 * @author Linbo Ge
 * @date 2020/6/22 14:51
 */
public class Demo2 {

    public int[] reversePrint(ListNode head) {
        ListNode currentNode = head;
        int len = 0;
        while (currentNode != null) {
            len++;
            currentNode = currentNode.next;
        }

        int[] result = new int[len];
        currentNode = head;
        for (currentNode = head; currentNode != null; currentNode = currentNode.next) {
            result[len - 1] = currentNode.val;
            len--;
        }
        return result;
    }

    private class ListNode {

        int val;
        ListNode next = null;

        public ListNode(int x) {
            this.val = x;
        }

    }
}

