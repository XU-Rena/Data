package com.xu.Tree;

import com.xu.Tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class sumLeave {
//    public int sumOfLeftLeaves(TreeNode root) {
//        if (root == null) return 0;
//        int leftValue = sumOfLeftLeaves(root.left);    // 左
//        int rightValue = sumOfLeftLeaves(root.right);  // 右
//
//        int midValue = 0;
//        if (root.left != null && root.left.left == null && root.left.right == null) {
//            midValue = root.left.val;
//        }
//        int sum = midValue + leftValue + rightValue;  // 中
//        return sum;
//    }


    public static int findBottomLeftValue(TreeNode root) {
        //思路：层序遍历，记录下最底层  最左边的节点
        Queue<TreeNode> que=new LinkedList();
        if(root==null){
            return 0;
        }
        que.offer(root);
        int res=0;
        while(!que.isEmpty()){
            int size=que.size();
            for(int i=0;i<size;i++){
                TreeNode node=que.poll();
                if (i == 0) {
                    res = node.val;
                }

                if(node.left!=null){
                    que.offer(node.left);
                }
                if(node.right!=null){
                    que.offer(node.right);
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Integer[]arr={2,1,3};
        TreeNode root=TreeNodeUtils.arrayToTreeNode(arr);
        System.out.println(findBottomLeftValue(root));

    }
}
