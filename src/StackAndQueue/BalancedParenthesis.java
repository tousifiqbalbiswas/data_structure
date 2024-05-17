package StackAndQueue;

import java.util.*;

public class BalancedParenthesis {
    public static void main(String[] args) {
        String s = "[([]){}]";

        System.out.println(isBalanced("(()())"));
    }

    public static int isBalanced(String s) {
        //You can code here
        Stack<Character> stack = new Stack<>();

        if (s.length() == 1 || s.isEmpty())
            return 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[')
                stack.push(((Character) c));
            else {

                if (stack.empty()) {
                    return 0;
                }
                else
                {

                    if (c == ')' && stack.peek() == '(') {
                        stack.pop();
                    } else if (c == ']' && stack.peek() == '[') {
                        stack.pop();
                    } else if (c == '}' && stack.peek() == '{') {
                        stack.pop();
                    } else {
                        return 0;
                    }
                }
            }
        }

        if (stack.empty())
            return 0;

        return 1;
    }










}

/*
            if(c=='(' || c=='{' || c=='[')
            stack.push(((Character) c));
            else {
                if (c==')' &&stack.peek()=='('&& !s.isEmpty()){
                    stack.pop();
                }
                else if (c==']' &&stack.peek()=='[' &&!s.isEmpty()){
                    stack.pop();
                }
                else if (c=='}' &&stack.peek()=='{' &&!s.isEmpty()){
                    stack.pop();
                }
                else {
                    flag=false;
                    System.out.println(flag);
                    return;
                }
*/


/*        if (stack.empty())
            flag=true;
        System.out.println(flag);*/



//    public static boolean isBalanced(String s) {
//
//        Stack<Character> stack = new Stack<>();
//
//        Map<Character, Character> map = new HashMap<>();
//        map.put('(',')');
//        map.put('{', '}');
//        map.put('[', ']');
//
//        for (char c : s.toCharArray()) {
//            if (map.containsKey(c)) {
//                stack.push(c);
//            }
//            else if (map.containsValue(c)) {
//                if(stack.empty())
//                    return false;
//                char temp = stack.pop();
//                if (!(c == map.get(temp)))
//                    return false;
//            }
//
//
//        }
//        return true;
//    }

