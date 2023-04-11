package com.xu.HashTable;

import java.util.HashMap;
import java.util.Map;

public class romanToInt {
    public int romanToInt(String s) {
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        char []nums=s.toCharArray();
        int res=0;
        for(int i=0;i<nums.length;i++){
            int temp=map.get(s.charAt(i));
            if(i<nums.length-1 && temp<map.get(nums[i+1]) ){
                res-=temp;
            }else{
                res+=temp;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        romanToInt romanToInt = new romanToInt();
        romanToInt.romanToInt("MCMXCIV");
    }
}
