package com.xu.Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class ValidParentheses {
    public int isValid(String s) {
        //思路：遇到左括号就把相应的右括号入栈，遇到右括号就和栈里的做匹配
//        Stack<Character> stack=new Stack();
//        char[] arr=s.toCharArray();
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]=='('){
//                stack.push(')');
//            }else if(arr[i]=='['){
//                stack.push(']');
//            }else if(arr[i]=='{'){
//                stack.push('}');
//            }else if(stack.isEmpty()||stack.peek()!=arr[i]){
//                return false;
//            }else{
//                stack.pop();
//            }
//        }
//        return true;

        //消消乐思路
//        char[] str=s.toCharArray();
//        Stack<Character> stack=new Stack();

//        for(int i=0;i<s.length();i++){
//            if (stack.empty())
//            {
//                stack.push(str[i]);
//                continue;
//            }
//            char top=(char)stack.peek();
//
//            if(str[i]==')' && top=='('){
//                stack.pop();
//                continue;
//            }else if(str[i]==']' && top=='['){
//                stack.pop();
//                continue;
//            }else if(str[i]=='}' && top=='{'){
//                stack.pop();
//                continue;
//            }
//            stack.push(str[i]);
//        }
//        return stack.isEmpty();
        Deque<Integer> st = new ArrayDeque<Integer>();
        st.push(0);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(0);
            } else {
                int v = st.pop();
                int top = st.pop() + Math.max(2 * v, 1);
                st.push(top);
            }
        }
        return st.peek();


    }


    public static void main(String[] args) {
        ValidParentheses P=new ValidParentheses();
        System.out.println(P.isValid("(()(()))"));
    }
}
