package com.xu.weekTest.week306;

import java.util.HashSet;
import java.util.Set;

public class minimumOperations {
    public int minimumOperations(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            if(num>0){
                set.add(num);
            }
        }
        return set.size();
    }
    public static void main(String[] args) {
        minimumOperations minimumOperations = new minimumOperations();
        minimumOperations.minimumOperations(new int[]{1, 5, 0, 3, 5});

    }
    
}
