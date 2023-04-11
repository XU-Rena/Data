package com.xu.paixu.basicSort;

import java.util.Arrays;

public class BubbleSort {
    /*
    * 冒泡排序
    * 步骤：比较相邻的两个元素，如果第一个比第二个大就交换他们
    *      直到每两个相邻的都比过就完了
    * */
    public static void main(String[] args) {
        int []arr={1,3,5,2,8};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }

            System.out.println(Arrays.toString(arr));

    }

}
