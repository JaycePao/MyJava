package com.liuqiao.algorithm;

public class DiameterOfBinaryTree {

    private static int maxDiameter = 0;

    public static int diameterOfBinaryTree(TreeNode root) {
        getDepth(root);
        return maxDiameter;
    }

    private static int getDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftDepth = getDepth(node.left);
        int rightDepth = getDepth(node.right);

        int currentDiameter = leftDepth + rightDepth;
        maxDiameter = Math.max(maxDiameter, currentDiameter);

        return Math.max(leftDepth, rightDepth) + 1;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        System.out.println(diameterOfBinaryTree(root));
    }
}
