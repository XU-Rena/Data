package com.xu.backTracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * @project: Data
 * @ClassName: letterCombinations
 * @author: wx
 * @creat: 2023/4/11 8:48
 * 描述:电话号码的映射
 */
public class letterCombinations {
    List<String> res = new ArrayList<>();
    StringBuilder path = new StringBuilder();
    public  List<String> letterCombinations(String digits) {
        HashMap<Character, String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        backtracking(digits, map, 0);
        return res;
    }
    private void backtracking(String digits,HashMap<Character,String> map, int index){
        if (index == digits.length() - 1) {
            res.add(path.toString());
            return;
        }
        //获得当前num对应的字母
        char digital = digits.charAt(index);
        String str = map.get(digital);
        for (int i = 0;i < str.length(); i++) {
            path.append(str.charAt(i));
            backtracking(digits,map,index + 1);
            path.deleteCharAt(path.length() - 1);
        }

    }

    public static void main(String[] args) {
        letterCombinations letterCombinations = new letterCombinations();
        System.out.println(letterCombinations.letterCombinations("23"));

    }
}
