package com.hello.linkedList;

public class SinglyLinkedList {

    Node head;

    public Node createList(int n) {
        if(n <= 0) {
            return null;
        }

        head = new Node(0);
        Node currNode = head;

        for(int i = 1; i <= n; i++) {
            Node node = new Node(i);
            currNode.next = node;
            currNode = currNode.next;
        }
        return head;
    }

    public Node getNode() {
        return head;
    }

    public Node insertAtHead(int v) {
        Node newNode = new Node(v);
        newNode.next = head;
        head = newNode;
        return head;
    }

    public void printNodes(Node node) {
        while(node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
    }

    public void printNodes() {
        Node node = head;
        while(node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
    }

    public void insertAtTail(int v) {
        Node newNode = new Node(v);
        Node node = head;
        while(node.next != null) {
            node = node.next;
        }
        node.next = newNode;
    }

    public int length(){
        if(head == null) {
            return 0;
        }
        Node node = head;
        int counter = 0;
        while(node != null) {
            ++counter;
            node = node.next;
        }
        return counter;
    }

    public void deleteAtHead(){
        if(null == head){
            return;
        }

        Node node = head.next;
        head = node;
    }

    public void deleteAtTail() {
        if(null == head){
            return;
        }
        Node node = head;
        Node prev = head;
        while(node.next != null) {
            prev = node;
            node = node.next;
        }
        prev.next = null;
    }

    public void insertAtPosition(int value, int position) {
        if(null == head){
            return;
        }

        if(position < 0 || position > length()) {
            return;
        }

        if(position == 0){
            insertAtHead(value);
        }

        if(position == length()) {
            insertAtTail(value);
        }

        int index = 0;
        Node node = head;
        Node prev = head;
        while(index != position && node.next != null) {
            ++index;
            prev = node;
            node = node.next;
        }

        Node newNode = new Node(value);
        newNode.next = prev.next;
        prev.next = newNode;
    }

    public void reversePrint() {
        if (head == null || head.next == null)
            return;
        Node prev = null, cur = head, temp = null;

        while (cur != null) {
//            0 -> 1 -> 2 -> 3 -> 4 -> 5 ->
//            temp = 1
            temp = cur.next;
//            0 -> null
            cur.next = prev;
//            prev = 0
            prev = cur;
//            cur = 1;
            cur = temp;
        }

        head = prev;
    }

    public int addList(Node node) {
        Node cur = node;
        int sum = 0;
        while(cur != null) {
            sum += cur.val;
            cur = cur.next;
        }
        return sum;
    }
}
