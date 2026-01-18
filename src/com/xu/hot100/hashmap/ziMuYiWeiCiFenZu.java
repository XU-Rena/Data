package com.xu.hot100.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @project: Data
 * @ClassName: ziMuYiWeiCiFenZu
 * @author: wx
 * @creat: 2026/1/18 16:59
 * 描述:字母异位词分组
 * 给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
 * 示例 1:
 * 输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
 * 输出: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * 解释：
 * 在 strs 中没有字符串可以通过重新排列来形成 "bat"。
 * 字符串 "nat" 和 "tan" 是字母异位词，因为它们可以重新排列以形成彼此。
 * 字符串 "ate" ，"eat" 和 "tea" 是字母异位词，因为它们可以重新排列以形成彼此。
 * 示例 2:
 * 输入: strs = [""]
 * 输出: [[""]]
 * 示例 3:
 * 输入: strs = ["a"]
 * 输出: [["a"]]
 * 提示：
 * 1 <= strs.length <= 104
 * 0 <= strs[i].length <= 100
 * strs[i] 仅包含小写字母
 */
public class ziMuYiWeiCiFenZu {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        //把strs里的str排序后做key,看看map里边有没有，如果有，value就是原始符合的Str
        for(String s : strs) {
          char[] str = s.toCharArray();
          Arrays.sort(str);
          String s1 = new String(str);
          List<String> list= map.getOrDefault(s1,new ArrayList<String>());
          list.add(s);
          map.put(s1,list);
        }
        return new ArrayList<List<String>>(map.values());
    }
    public static void main(String[] args) {
         ziMuYiWeiCiFenZu a = new ziMuYiWeiCiFenZu();
         String[] strs ={"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(a.groupAnagrams(strs));
    }
}
