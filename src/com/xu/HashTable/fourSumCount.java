package com.xu.HashTable;

import java.util.HashMap;

public class fourSumCount {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                int temp=nums1[i]+nums2[j];
                if(map.containsKey(temp)){
                   map.put(temp,map.get(temp)+1);
                }else{
                    map.put(temp,1);
                }
            }
        }
        int res=0;
        for(int i=0;i<nums3.length;i++){
            for(int j=0;j<nums4.length;j++){
                int temp=nums3[i]+nums4[j];
                if(map.containsKey(0-temp)){
                    res += map.get(0 - temp);
                }
            }
        }
        return res;

    }

    public static void main(String[] args) {
        fourSumCount fourSumCount = new fourSumCount();
        fourSumCount.fourSumCount(new int[]{1, 2}, new int[]{-2, -1}, new int[]{-1, 2}, new int[]{0, 2});

    }
}
