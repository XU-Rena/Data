package com.xu.MoNi;

public class maxAscendingSum {
    public int maxAscendingSum(int[] nums) {
        int res=nums[0];
        int sum=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                sum+=nums[i];
            }else{
                sum=nums[i];
            }
            res=Math.max(res,sum);

        }
        return res;
    }

    public static void main(String[] args) {
        maxAscendingSum maxAscendingSum = new maxAscendingSum();
        maxAscendingSum.maxAscendingSum( new int[]{10, 20, 30, 40, 50});

    }
}

