package com.xu.ShuangZhiZhen;

public class RemoveArrayRepeat {
    public int removeDuplicates(int[] nums) {
//        int slow=0;
//        for(int fast=1;fast<nums.length;fast++){
//            if(nums[slow]!=nums[fast]){
//                nums[slow+1]=nums[fast];
//                slow++;
//            }
//
//        }
//        return slow+1;
        int slow = 0;
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[slow] == nums[fast]) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        RemoveArrayRepeat p=new RemoveArrayRepeat();
        System.out.println(p.removeDuplicates(nums));
    }
}
