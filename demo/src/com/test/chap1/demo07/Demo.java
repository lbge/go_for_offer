package com.test.chap1.demo07;

import java.util.Arrays;

/**
 * @author Linbo Ge
 * @date 2020/6/22 16:18
 */
public class Demo {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.val = x;
        }
    }


    private TreeNode buildTree(int[] pre, int[] in) {

        int n = pre.length;
        if (n == 0) {
            return null;
        }

        int rootVal = pre[0], rootIndex = 0;
        for (int i = 0; i < n; i++) {
            if (in[i] == rootVal) {
                rootIndex = i;
                break;
            }
        }
        TreeNode root = new TreeNode(rootVal);


        root.left = buildTree(Arrays.copyOfRange(pre, 1, 1 + rootIndex), Arrays.copyOfRange(in, 0, rootIndex));
        root.right = buildTree(Arrays.copyOfRange(pre, 1 + rootIndex, n), Arrays.copyOfRange(in, rootIndex+1, n));

        return root;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] b = {4, 7, 2, 1, 5, 3, 8, 6};

        Demo demo = new Demo();
        TreeNode treeNode = demo.buildTree(a, b);
        System.out.println();
    }

}
