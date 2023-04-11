package com.xu.Stack;

import java.util.ArrayDeque;
import java.util.Stack;

public class RemoveRepet {
    public String removeDuplicates(String s) {
        //思路：用栈来做，依次入栈，像消消乐一样在站里碰到一样的就消掉，最后留在站立的就是我们要的字符串
//        Stack<Character> stack=new Stack();
//        char[] arr=s.toCharArray();
//        for(int i=0;i<arr.length;i++){
//            if(stack.isEmpty()||arr[i]==stack.peek()){
//                stack.push(arr[i]);
//            }else{
//                stack.pop();
//            }
//        }
//        String res="";
//        while(!stack.isEmpty()){
//            res=stack.pop()+res;
//        }
//        return res;

        ArrayDeque<Character> deque = new ArrayDeque<>();
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (deque.isEmpty() || deque.peek() != ch) {
                deque.push(ch);
            } else {
                deque.pop();
            }
        }
        String str = "";
        //剩余的元素即为不重复的元素
        while (!deque.isEmpty()) {
            str = deque.pop() + str;
        }
        return str;
    }

    public static void main(String[] args) {
        RemoveRepet removeRepet = new RemoveRepet();
        System.out.println(removeRepet.removeDuplicates("abbaca"));

    }
}
