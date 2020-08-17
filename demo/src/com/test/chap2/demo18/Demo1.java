package com.test.chap2.demo18;

/**
 * @author Linbo Ge
 * @date 2020/8/9 23:25
 */
public class Demo1 {

    private class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode deleteDuplication_2(ListNode pHead) {

        if (pHead == null || pHead.next == null){
            return pHead;
        }

        ListNode first = new ListNode(pHead.val -1);
        first.next = pHead;
        ListNode pre =first;
        ListNode cur = pHead;
        while (cur != null && cur.next != null){
            if (cur.val == cur.next.val){
                int val = cur.val;
                while (cur.val == val){
                    cur = cur.next;
                }
                pre.next = cur;
            }else {
                pre = cur;
                cur = cur.next;
            }
        }
        return pHead;
    }
}
