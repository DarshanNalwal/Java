package com.hello.stack;

import java.util.Stack;

public class BracketsBalancing {

    public static void main(String[] args) {
        /** Algorithm
         *
         * Put all opening brackets inside stack
         * if any closing bracket is found compare it with top element in stack
         * if the brackets balance then move further
         * else break
         */
        String s = "{[({})]}";

        System.out.println(isBalanced(s));
    }

    private static boolean isBalanced(String s) {

        if(s.length() %2 != 0){
            return false;
        }

        Stack<Character> stack = new Stack<Character>();
        for(char c : s.toCharArray()){

            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if(stack.isEmpty()) {
                    return false;
                }
                Character temp = stack.pop();
                if(temp == '(') {
                    if(c != ')') {
                        return false;
                    }

                } else if(temp == '{') {
                    if(c != '}') {
                        return false;
                    }
                } else if(temp == '[') {
                    if(c != ']') {
                        return false;
                    }
                }
            }
        }

        if(stack.isEmpty()) {
            return true;
        }

        return false;
    }
}
