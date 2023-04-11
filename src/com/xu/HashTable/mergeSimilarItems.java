package com.xu.HashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class mergeSimilarItems {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> ans = new ArrayList();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int[] item1:items1){
            //value,weight
            map.put(item1[0],item1[1]);
        }
        for(int [] item2:items2){
            if(map.containsKey(item2[0])){
                map.put(item2[0],map.get(item2[0])+item2[1]);
            }else{
                map.put(item2[0],item2[1]);
            }
        }
        Object[] keyArray = map.keySet().toArray();
        Arrays.sort(keyArray);
        for(Object i:keyArray){
            List<Integer> list =new ArrayList();
            Integer val=(Integer)i;
            list.add(val);
            list.add(map.get(val));
            ans.add(list);

        }

        return ans;




    }
    public static void main(String[] args) {

    }
}
