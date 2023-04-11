package com.xu.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @project: Data
 * @ClassName: minDepth
 * @author: wx
 * @creat: 2023/3/21 11:33
 * 描述:二叉树的最小深度
 */
public class minDepth {
    public static int minDepth(TreeNode root) {
        int min = 0;
        if (root == null) {
            return min;
        }
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        while (!que.isEmpty()) {
            int size = que.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = que.poll();
                if (node.left == null && node.right == null) {
                    min++;
                }
                if (node.left != null) {
                    que.offer(node.left);
                }
                if (node.right != null) {
                    que.offer(node.right);
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Integer[]arr={3,9,20,null,null,15,7};
        TreeNode root=TreeNodeUtils.arrayToTreeNode(arr);
        System.out.println(minDepth(root));
    }
}
