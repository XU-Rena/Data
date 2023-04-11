package com.xu.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrder {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> resList = new ArrayList<List<Integer>>();
        if (root == null) {
            return resList;
        }
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        que.offer(root);
        while (!que.isEmpty()) {
            List<Integer> itemList = new ArrayList<Integer>();
            int len = que.size();
            while (len > 0) {
                TreeNode temp = que.poll();
                itemList.add(temp.val);
                if (temp.left != null) que.offer(temp.left);
                if (temp.right != null) que.offer(temp.right);
                len--;
            }
            resList.add(itemList);

        }
        return resList;
    }

    public static void main(String[] args) {
        Integer[]arr={3,9,20,null,null,15,7};
        TreeNode root=TreeNodeUtils.arrayToTreeNode(arr);
        System.out.println(levelOrder(root));
    }
}
