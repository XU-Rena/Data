package com.xu.ShuangZhiZhen;

public class ContainerMaxWater {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int res=0;
        while(left<right){
            int h=height[left]<height[right]?height[left]:height[right];
            int s=h*(right-left);
            res=Math.max(s,res);
           if(height[left] < height[right] ){
               left++;
           }else{
               right--;
           }

        }
        return res;
    }
    public static void main(String[] args) {
        ContainerMaxWater containerMaxWater = new ContainerMaxWater();
        containerMaxWater.maxArea(new int[]{1,8,6,2,5,4,8,3,7});

    }
}
