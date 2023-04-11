package com.xu.ShuangZhiZhen;

public class backspaceCompare {
    public boolean backspaceCompare(String s, String t) {
        // equals()判断返回的两个字符串是否相等
        return changeString(s).equals(changeString(t));

    }

    public static String changeString (String str) {
        // 先将字符串转为数组，方便使用双指针法
        char[] x = str.toCharArray();
        int slow = 0;
        for (int fast = 0; fast < x.length; fast++) {
            // 当x[fast] != '#'时，x[fast]覆盖x[slow]，然后slow++
            if (x[fast] != '#')
                x[slow++] = x[fast];
                // 当x[fast] = '#'且slow!=0时，slow--
            else if (x[fast] == '#' && slow != 0)
                slow--;
        }

        // 返回字符串
        return String.valueOf(x, 0, slow);

    }
    public static void main(String[] args) {
        backspaceCompare backspaceCompare = new backspaceCompare();
        System.out.println(backspaceCompare.backspaceCompare("ab#c",  "ad#c"));

    }
}
