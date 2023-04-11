package com.xu.paixu.basicSort;

import java.util.Arrays;

/*
* 插入排序
* 扑克牌，第一个就当已经排序玩的，剩下的第一个跟他比，排，拍完了剩下的里的第一个在跟拍好的最后一个比，拍好的倒数第二笔
* 2，7，3，5，8     第一轮   2， 7，3，5，8       7和2  2，7     3，5，8
*                  第二轮   2，7   3，5，8      3和7   2，3，7   5，8
*                                             3和2    2，3，7  5，8
*                  第三轮    2，3，7   5，8      5和7    2，3，5，7   8
*                                              5和3    2，3，5，7   8
*                                              5和2     2，3，5，7  8
*                  第四轮    2，3，5，7  8       8，5
* */
public class insertionSort {
    public static void main(String[] args) {
        int []arr={2,6,1,3,7};
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
              if(arr[j]<arr[j-1]){
                 int temp=arr[j];
                 arr[j]=arr[j-1];
                 arr[j-1]=temp;
              }else{
                  break;
              }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
