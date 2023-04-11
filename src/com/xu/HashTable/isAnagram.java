package com.xu.HashTable;

import java.util.HashMap;
import java.util.Map;

public class isAnagram {
    public boolean isAnagram(String s, String t) {
        int[] record = new int[26];
        for (char c : s.toCharArray()) {
            record[c - 'a'] += 1;
        }
        for (char c : t.toCharArray()) {
            record[c - 'a'] -= 1;
        }
        for (int i : record) {
            if (i != 0) {
                return false;
            }
        }
        return true;

    }


    public static void main(String[] args) {
        isAnagram isAnagram = new isAnagram();
        isAnagram.isAnagram("anagram","nagaram");

    }
}
