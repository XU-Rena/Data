package com.xu.HashTable;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class longestConsecutive {
    public int longestConsecutive(int[] nums) {

//        Arrays.sort(nums);
//        int res = 0, max = Integer.MIN_VALUE;
//        if(nums.length == 0 || nums.length == 1){
//            return nums.length;
//        }
//        for(int i = 1; i < nums.length; i++){
//            if(nums[i] - nums[i-1] == 1){
//                res ++;
//            }else if(nums[i] - nums[i-1] > 1){
//                res = 0;
//            }
//            max = Math.max(max, res);
//        }
//        return max+1;

        HashSet<Integer> set = new HashSet<>();//set添加的元素不会重复
        for(int num : nums){
            set.add(num);
        }
        int res=0;
        for(int i: set){
            if(!set.contains(i-1)){
                int y=i;
                while(set.contains(y+1)){
                    y++;
                }
                res=Math.max(res,y-i+1);
            }

        }

        return res;
    }
    public static void main(String[] args) {
        longestConsecutive longestConsecutive = new longestConsecutive();
        longestConsecutive.longestConsecutive(new int[]{100,4,200,1,3,2});

    }
}
