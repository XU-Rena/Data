package com.xu.backTracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @project: Data
 * @ClassName: combinationSum
 * @author: wx
 * @creat: 2023/4/12 8:41
 * 描述:组合总和
 */
public class combinationSum {
    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtracking(candidates, target, 0, 0);
        return res;
    }
    private void backtracking (int[]candidates, int target, int startIndex, int sum) {
        if (sum > target) {
            return;
        }
        if (sum == target) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i < candidates.length; i++) {
            sum += candidates[i];
            path.add(candidates[i]);
            backtracking(candidates, target, i, sum);
            sum -= candidates[i];
            path.removeLast();
        }

    }

    public static void main(String[] args) {
        combinationSum combinationSum = new combinationSum();
        System.out.println(combinationSum.combinationSum(new int[]{2,3,5},8));
    }
}
