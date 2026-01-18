package com.xu.hot100.hashmap;

import java.util.HashSet;
import java.util.Set;

/**
 * @project: Data
 * @ClassName: zuiChangLianXuXuLie
 * @author: wx
 * @creat: 2026/1/18 17:46
 * 描述:最长连续序列
 * 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
 * 请你设计并实现时间复杂度为 O(n) 的算法解决此问题。
 * 示例 1：
 * 输入：nums = [100,4,200,1,3,2]
 * 输出：4
 * 解释：最长数字连续序列是 [1, 2, 3, 4]。它的长度为 4。
 * 示例 2：
 * 输入：nums = [0,3,7,2,5,8,4,6,0,1]
 * 输出：9
 * 示例 3：
 * 输入：nums = [1,0,1,2]
 * 输出：3
 */
public class zuiChangLianXuXuLie {
    public int longestConsecutive(int[] nums) {
      //先进行去重，再找到起始点，然后把当前长度和最大长度去比较
        Set<Integer> set = new HashSet<>();
        //最大长度
        int max = 0;
        //当前长度
        int len = 0;
        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for(int i: set) {
            //找当前数的减一数有没有
            if(!set.contains(i - 1)) {
                //不包含当前数的减一数
                len = 1;
                //temp是想要找的下一个数字
                int temp = i + 1;
                while (set.contains(temp)) {
                    len++;
                    temp++;
                }
            }
            max = Math.max(len,max);
        }
        return max;
    }
    public static void main(String[] args) {
        zuiChangLianXuXuLie a = new zuiChangLianXuXuLie();
        int[] ints = {100,4,200,1,3,2};
        System.out.println(a.longestConsecutive(ints));
    }
}
