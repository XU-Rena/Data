package com.xu.backTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @project: Data
 * @ClassName: combinationSum2
 * @author: wx
 * @creat: 2023/4/12 9:48
 * 描述:组合总合2
 */
public class combinationSum2 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        //把重复的元素放在一起方便横向去重
        Arrays.sort(candidates);
        backtracking(candidates, 0, 0, target);
        return res;
    }
    private void backtracking (int[] candidates, int startIndex, int sum, int target) {
        if (sum == target) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = startIndex; i < candidates.length && sum + candidates[i] <= target; i++) {
            //横向去重
            if (i > startIndex && candidates[i] == candidates[i - 1]) {
                continue;
            }
            sum += candidates[i];
            path.add(candidates[i]);
            backtracking(candidates, i + 1, sum, target);
            sum -= candidates[i];
            path.remove(path.size() - 1);
        }
    }


    public static void main(String[] args) {
        combinationSum2 combinationSum2 = new combinationSum2();
        System.out.println(combinationSum2.combinationSum2(new int[]{1,1,2}, 3));

    }

}
