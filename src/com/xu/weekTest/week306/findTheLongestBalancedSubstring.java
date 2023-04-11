package com.xu.weekTest.week306;

/**
 * @project: Data
 * @ClassName: findTheLongestBalancedSubstring
 * @author: wx
 * @creat: 2023/4/10 15:21
 * 描述:最长平衡子串
 */
public class findTheLongestBalancedSubstring {
    public static int findTheLongestBalancedSubstring(String s) {
        int res = 0;
        char[] str = s.toCharArray();
        int left = 0;
        for (int right = 1; right < str.length; right++) {
            if (str[left] == '0' && str[right] == '1') {
                res++;
            } else {
                left = right;
                
            }
            left++;
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
