package com.xu.xiecheng;

/**
 * @project: Data
 * @ClassName: StableShuZu
 * @author: wx
 * @creat: 2023/3/7 19:04
 * 描述:稳定数组
 */
public class StableShuZu {
    public static int Stable (int[] arr) {
        int left = 0;
        int res = 0;
        int sum = 0;
        for (int right = 1; right < arr.length; right++) {
            if (Math.abs(arr[right] - arr[left]) <= 1) {
                sum += 1;
            } else {
                //res =  Math.max(res,sum);
                sum = 0;
            }
            res =  Math.max(res,sum);
            left++;
        }
        return res+1;
    }

    public static void main(String[] args) {
        System.out.println(StableShuZu.Stable(new int[]{2,4,2,3,2,2,2,5,5,5}));
    }
}
