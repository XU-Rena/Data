package com.xu.ShuangZhiZhen;

public class MoveZero {
    public void moveZeroes(int[] nums) {
        int slow=0;
        for(int fast=0;fast<nums.length;fast++){
            if(nums[fast]!=0){
                nums[slow]=nums[fast];
                slow++;
            }else{
                nums [slow++] = 0;
            }
        }

    }
    public static void main(String[] args) {
        MoveZero zero = new MoveZero();
        int[] ints = {0,1,0,3,12};
        zero.moveZeroes(ints);
    }
}
