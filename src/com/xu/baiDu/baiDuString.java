package com.xu.baiDu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @project: Data
 * @ClassName: baiDuString
 * @author: wx
 * @creat: 2023/3/13 19:39
 * 描述:重组字符串
 */
public class baiDuString {
    static Boolean isTrue(String str){

        int[] jilu = new int[26];
        for (char c : str.toCharArray()) {
            jilu[c - 'a'] += 1;
        }

        List<Character> list = new ArrayList<>();
        list.add('B');
        list.add('a');
        list.add('i');
        list.add('d');
        list.add('u');

        for (char c : list) {
            jilu[c - 'a'] -= 1;
        }

        for (int i : jilu) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

            String str = "daidu";
            if (baiDuString.isTrue(str) ){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }



    }
}
