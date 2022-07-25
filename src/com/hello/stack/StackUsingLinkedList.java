package com.hello.stack;

public class StackUsingLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    Node root;

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = root;
        root = newNode;
    }

    void print() {
        if(null == root) {
            System.out.println("Stack is empty");
            return;
        }
        Node node = root;

        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    int pop() {
        if(root == null) {
            System.out.println("Stack underflow");
            return -1;
        } else {
            int popData = root.data;
            root = root.next;
            return popData;
        }
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();

        stack.push(15);
        stack.push(16);
        stack.push(17);
        stack.push(18);

        stack.print();
        System.out.println();

        stack.pop();

        stack.print();
    }
}
