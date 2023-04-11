package com.xu.HashTable;

import java.util.HashMap;
import java.util.Map;

public class lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int res=0;
        for(int begin=0,end=0;end<s.length();end++){
            int ele=map.get(s.charAt(end));
            if(map.containsKey(ele)){
                begin=Math.max(begin,map.get(ele)+1);
            }
            res=Math.max(end-begin+1,res);
            map.put(s.charAt(end),end);
        }


        return res;
    }

    public static void main(String[] args) {
        lengthOfLongestSubstring lengthOfLongestSubstring = new lengthOfLongestSubstring();
        lengthOfLongestSubstring.lengthOfLongestSubstring("pwwkew");

    }
}
