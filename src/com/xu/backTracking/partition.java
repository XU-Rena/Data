package com.xu.backTracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @project: Data
 * @ClassName: partition
 * @author: wx
 * @creat: 2023/4/13 10:22
 * 描述:分割字符串
 */
public class partition {
    List<List<String>> res = new ArrayList<>();
    List<String> path = new ArrayList<>();
    public List<List<String>> partition(String s) {
        backtracking(s,0);
        return res;
    }
    private void backtracking (String s, int startIndex) {
        //>=?
        if (startIndex >= s.length()) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i < s.length(); i++) {
            if (isPalindrome(s.substring(startIndex,i + 1))) {
                String s1 = s.substring(startIndex,i + 1);
                path.add(s1);
            } else {
                continue;
            }
            backtracking(s, i + 1);
            path.remove(path.size() - 1);
        }
    }
    private boolean isPalindrome (String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        partition partition = new partition();
        System.out.println(partition.partition("aab"));

    }

}
