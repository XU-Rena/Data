package com.xu.backTracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @project: Data
 * @ClassName: subsets
 * @author: wx
 * @creat: 2023/4/16 18:45
 * 描述:子集
 */
public class subsets {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtracking(nums, 0);
        return res;
    }

    private void backtracking (int[] nums, int startIndex) {
        res.add(new ArrayList<>(path));
        if (startIndex > nums.length) {
            return;
        }
        for (int i = startIndex; i < nums.length; i++) {
            path.add(nums[i]);
            backtracking(nums, i + 1);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        subsets subsets = new subsets();
        System.out.println(subsets.subsets(new int[]{1, 2, 3}));

    }
}
