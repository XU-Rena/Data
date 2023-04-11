package com.xu.dp;

public class findTargetSumWays {
    public static int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];

        }
      //  System.out.println((target + sum) % 2);
        if ((target + sum) % 2 != 1) return 0;
        int size = (target + sum) / 2;
        if(size < 0) size = -size;
        int[] dp = new int[size + 1];
        dp[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = size; j >= nums[i]; j--) {
                dp[j] += dp[j - nums[i]];
            }
        }
        return dp[size];
    }

    public static void main(String[] args) {
        System.out.println(findTargetSumWays(new int[]{100,100},-400));
    }
}
