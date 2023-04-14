package com.xu.backTracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @project: Data
 * @ClassName: restoreIpAddresses
 * @author: wx
 * @creat: 2023/4/13 11:11
 * 描述:复原ip地址
 */
public class restoreIpAddresses {
    List<String> res = new ArrayList<>();
    List<String> path = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        backtracking(s,0);
        return res;
    }
    private void backtracking (String s, int startIndex) {
        if (startIndex == s.length() && path.size() == 4) {
            res.add(String.join(".", path));
            return;
        }
        for (int i = startIndex; i < s.length(); i++) {
                String str = s.substring(startIndex, i + 1);  // 取子串
                if(Integer.valueOf(str) > 255 || (s.charAt(startIndex) == '0' && i > startIndex)) break;
                path.add(str);
                backtracking(s, i + 1);
                path.remove(path.size() - 1);
            }
        }
    public static void main(String[] args) {
        restoreIpAddresses restoreIpAddresses = new restoreIpAddresses();
        System.out.println(restoreIpAddresses.restoreIpAddresses("25525511135"));

    }


}
