package com.hello.stack;

import java.util.Stack;

public class ReverseStack {

    public static void main(String[] args) {
        /**
         * Use recursion
         *
         * if stack is empty then push x
         * else initialise variable x with top value of stack and do recursive call
         *
         * once recursive call is returned
         * call another recursive method to insertAtBottom with stack and x as parameters
         * to insert at bottom do recursive call by poping top element and storing it in a variable y until stack is empty
         * if stack is empty push x to stack
         * during return push x to stack
         *
         */

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        reverse(stack);

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

    private static void reverse(Stack<Integer> stack) {

        if(stack.isEmpty()){
            return;
        }
        int x = stack.pop();
        reverse(stack);
        insertAtBottom(stack,x);
    }

    private static void insertAtBottom(Stack<Integer> stack, int x) {

        if(stack.isEmpty()){
            stack.push(x);
            return;
        }

        int y = stack.pop();
        insertAtBottom(stack, x);
        stack.push(y);
    }
}
