package com.xu.MoNi;

public class areAlmostEqual {
    public boolean areAlmostEqual(String s1, String s2) {
        //字母频率一样，遍历有0处不同或者两处不同
        if(s1.length()!=s2.length()){
            return false;
        }
        int n = s1.length(), a = -1, b = -1;
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) == s2.charAt(i)) continue;
            if (a == -1) a = i;
            else if (b == -1) b = i;
            else return false;
        }
        if (a == b && b == -1) return true;//a=b=-1,没有不同的位置
        if (a == -1 || b == -1) return false;//不同位置只有一个（eg:"bank""kank"），直接返回false
        return s1.charAt(a) == s2.charAt(b) && s1.charAt(b) == s2.charAt(a);


    }

    public static void main(String[] args) {
        areAlmostEqual maxAscendingSum = new areAlmostEqual();
        maxAscendingSum.areAlmostEqual("bank","kanb");
    }
}
