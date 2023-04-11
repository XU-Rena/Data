package com.xu.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class preorderTraversal {
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null){
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            result.add(node.val);
            if (node.right != null){
                stack.push(node.right);
            }
            if (node.left != null){
                stack.push(node.left);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Integer[]arr={2,1,3};
        TreeNode root=TreeNodeUtils.arrayToTreeNode(arr);
        System.out.println(preorderTraversal(root));

    }
}
