package com.xu.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class inorderTraversal {
    public static List<Integer> inorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null){
            return res;
        }
        while(root != null || !stack.isEmpty()){
            //因为中序遍历顺序是左根右，因此先将根节点和左子树压栈
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            res.add(root.val);
            root = root.right;
        }
        return res;
    }

    public static void main(String[] args) {
        Integer[]arr={2,1,3};
        TreeNode root=TreeNodeUtils.arrayToTreeNode(arr);
        System.out.println(inorderTraversal(root));
    }
}
