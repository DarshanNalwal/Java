package com.hello.stack;

public class StackUsingArray {

    int top;
    int a[];
    int size;

    StackUsingArray(int size) {
        top = -1;
        this.size = size;
        a = new int[size];
    }

    public boolean push(int data) {
        if(top == size - 1){
            System.out.println("Max size reached. Stack overflow.");
            return false;
        } else {
            a[++top] = data;
            System.out.println("Pushed " + data + " successfully");
            return true;
        }
    }

    public void print() {
        if(top == -1)
            return;

        for(int i = top; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public int peek() {
        if(top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return a[top];
        }
    }

    public int pop() {
        if(top == -1) {
            System.out.println("Stack is empty. Stack underflow");
            return -1;
        } else {
            return a[top--];
        }
    }

    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(3);
        stack.push(14);
        stack.push(15);
        stack.push(16);
        stack.push(17);

        stack.print();

        System.out.println();
        System.out.println("Peek");
        System.out.println(stack.peek());

        System.out.println();
        System.out.println("Pop");
        System.out.println(stack.pop());

        stack.print();

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
