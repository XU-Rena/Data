package com.xu.ShuangZhiZhen;

import java.util.HashMap;
import java.util.Map;

public class totalFruit {
    public int totalFruit(int[] fruits) {
        int left=0;
        int res=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int right=0;right<fruits.length;right++){
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
            while(map.size()>2){
                map.put(fruits[left],map.get(fruits[left])-1);
                if(map.get(fruits[left])==0){
                    map.remove(fruits[left]);
                }
                left++;
            }
            res=Math.max(res,right-left+1);
        }
        return res;
    }

    public static void main(String[] args) {
        totalFruit totalFruit = new totalFruit();
        totalFruit.totalFruit(new int[]{0,1,2,2});

    }

}
