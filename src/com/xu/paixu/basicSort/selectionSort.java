package com.xu.paixu.basicSort;
/*
 * 选择排序
 *假定第一个为最小值，用它和后边的比，如果有比他小的，就把这个小的付给最小值，直到全都遍历完，
 * 得到的最小值，放第一位，这是排完序的，再把剩下的按照这个流程弄，弄出的数依次排在排完序的后边接上
 * 1，3，5，2，8    第一轮  1，3，5，2，8   1和3  1小  min=1
 *                                      1和5       min=1
 *                                      1和2       min=1
 *                                      1和8       min=1   结果   1，3，5，2，8
 *                第二轮   1，3，5，2，8   3,5       min=3
 *                                       3,2      min=2
 *                                       2,8      min=2   结果    1，2，3，5，8
 *                第三轮    1,2,3,5,8    3,5       min=3
 *                                      3,8      min=3     结果    1,2,3,5,8
 *                第四轮    1,2,3,5,8     5,8      min=5    结果     1,2,3,5,8
 *
 * */

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int []arr={1,3,5,2,8};
        for(int i=0;i<arr.length-1;i++){
                int minindex=i;//用于记录最小值的下标
            for(int j=i+1;j<arr.length;j++){
               if(arr[j]<arr[minindex]){
                   minindex=j;
                   int temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
            }
        }

            System.out.println(Arrays.toString(arr));

    }

}
