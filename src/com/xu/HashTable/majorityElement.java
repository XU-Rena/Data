package com.xu.HashTable;

import java.util.HashMap;

public class majorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxCount=0;
        int maxNum=0;
        for(int num:nums){
            //getOrDefault获取指定key对应得value；
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
            if (count > maxCount) {
                maxCount = count;
                maxNum = num;
            }
        }


        return maxNum;

    }

    public static void main(String[] args) {
        majorityElement majorityElement = new majorityElement();
        majorityElement.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2});

    }
}
