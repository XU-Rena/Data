package com.xu.HashTable;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        int []res=new int[2];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
            if(map.containsKey(target-nums[i])){
                res[0]=i;
                res[1]=map.get(target-nums[i]);
            }

        }
        return res;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        System.out.println(twoSum.twoSum(new int[]{3,3},6));

    }
}
