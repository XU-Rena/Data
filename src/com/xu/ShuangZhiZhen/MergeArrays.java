package com.xu.ShuangZhiZhen;

public class MergeArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //nums1的最后一个0位置
        int i=m-1;//nums1的3位置
        int j=n-1;//nums2的6位置
        for(int k=m+n-1;k>=0;k--){
             if((nums2[j]<=nums1[i]&&i>=0)||j<0){

                 nums1[k]=nums1[i];
                 i--;

            }else{
                 nums1[k]=nums2[j];
                 j--;

            }
        }
        }

//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int i = m - 1;
//        int j = n - 1;
//
//        for(int k = m + n - 1;k >= 0; k--) {
//            if (j < 0 || (i >= 0 && nums1[i] >= nums2[j])) {
//                nums1[k] = nums1[i];
//                i--;
//            } else {
//                nums1[k] = nums2[j];
//                j--;
//            }
//        }
//
//    }
    public static void main(String[] args) {
        MergeArrays mergeArrays = new MergeArrays();
        mergeArrays.merge(new int[]{1, 2, 3, 0, 0, 0},3, new int[]{2, 5, 6},3);

    }
}
