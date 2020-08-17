package com.test.chap1.demo07;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Linbo Ge
 * @date 2020/6/22 16:46
 */
public class Demo02 {

    public Demo.TreeNode buildTree(int[] preorder, int[] inorder) {

        // 下面四行代码其实就是把数组转换成list
        List<Integer> pre = new ArrayList();
        for (int i : preorder) pre.add(i);
        List<Integer> in = new ArrayList();
        for (int i : inorder) in.add(i);

        //其实这个函数就这一行
        return f(pre, in);
    }

    Demo.TreeNode f(List pre, List in) {
        // 递归停止条件，就是遍历完了列表
        if (pre.size() == 0) return null;

        // 前序遍历的第一个，一定是root呀
        int val = (int) pre.get(0);
        Demo.TreeNode root = new Demo.TreeNode(val);

        // 从中序遍历里面找到root的位置，酒吧中序遍历分成两部分了
        int index = in.indexOf(root.val);

        //别问 问就是递归
        root.left = f(pre.subList(1, 1 + index),
                in.subList(0, index));
        root.right = f(pre.subList(1 + index, pre.size()),
                in.subList(1 + index, in.size()));
        return root;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] b = {4, 7, 2, 1, 5, 3, 8, 6};
        Demo02 demo02 = new Demo02();
        Demo.TreeNode treeNode = demo02.buildTree(a, b);
        System.out.println();
    }
}

