package com.xu.backTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @project: Data
 * @ClassName: subsetsWithDup
 * @author: wx
 * @creat: 2023/4/16 19:06
 * 描述:子集2
 */
public class subsetsWithDup {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort( nums );
        backtracking(nums, 0);
        return res;
    }

    private void backtracking (int[] nums, int startIndex) {
        res.add(new ArrayList<>(path));
        if (startIndex > nums.length) {
            return;
        }
        for (int i = startIndex; i < nums.length; i ++) {
            if (i > startIndex && nums[i] == nums[i - 1]) {
                continue;
            }
            path.add(nums[i]);
            backtracking(nums, i + 1);
            path.remove(path.size() - 1);
        }

    }

    public static void main(String[] args) {
        subsetsWithDup subsetsWithDup = new subsetsWithDup();
        System.out.println(subsetsWithDup.subsetsWithDup(new int[]{1, 2, 2}));
    }
}
