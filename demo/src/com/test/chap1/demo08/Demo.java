package com.test.chap1.demo08;

/**
 * @author Linbo Ge
 * @date 2020/6/23 10:07
 */
public class Demo {

    private static class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;//指向父节点

        public TreeLinkNode(int val) {
            this.val = val;
        }
    }

    public TreeLinkNode getNext(TreeLinkNode node) {
        // 如果当前结点右子树不空，那么中序下一个结点是右子树的最左子结点（如果有的话）；如果右子树没有左子结点就返回右子树根结点
        if (node.right != null) {
            node = node.right;
            while (node.left != null) {
                node = node.left;
            }
            return node;
        }
        // 如果当前子结点node右子树为空
        // !!!!(非常重要)
        // 返回上层的父结点，如果父结点的右子结点就是当前结点，继续返回到上层的父结点...直到父结点的左子结点等于当前结点
        while (node.next != null && node.next.right == node) {
            node = node.next;
        }
        // 如果父结点的左子结点等于当前结点，说明下一个要遍历的结点就是父结点了；或者父结点为空（说明当前结点是root），还是返回父结点（null）
        // node.next == null 或者 node.next.left == node
        return node.next;
    }
}
