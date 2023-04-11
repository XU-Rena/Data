package com.xu.HashTable;

import java.util.*;

public class groupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String p:strs) {
            char []arr=p.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            List<String> list=map.getOrDefault(key,new ArrayList<String>());
            list.add(p);
            map.put(key,list);
        }
       return new ArrayList<List<String>>(map.values());





    }

    public static void main(String[] args) {
        groupAnagrams groupAnagrams = new groupAnagrams();
        groupAnagrams.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});

    }
}
