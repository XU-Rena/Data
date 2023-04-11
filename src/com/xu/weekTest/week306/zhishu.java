package com.xu.weekTest.week306;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @project: Data
 * @ClassName: zhishu
 * @author: wx
 * @creat: 2023/4/9 10:51
 * 描述:对角线上的最大质数
 */
public class zhishu {
    public static int diagonalPrime(int[][] nums) {
        int max = 0;
        for (int i = 0;i < nums.length; i++) {
            if (isZhi(nums[i][i]) && nums[i][i] > max) {
                max = nums[i][i];
            }
            if (isZhi(nums[i][nums.length -i - 1]) && nums[i][nums.length -i - 1] > max) {
                max = nums[i][nums.length -i - 1];
            }
        }
        return max;

    }
    private static boolean isZhi (int num) {
        if (num < 2) {
            return false;
        }

        boolean[] arr = new boolean[num + 1];
        Arrays.fill(arr, true);

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (arr[i]) {
                for (int j = i * i; j <= num; j += i) {
                    arr[j] = false;
                }
            }
        }

        return arr[num];
    }

    public static void main(String[] args) {

    }
}
