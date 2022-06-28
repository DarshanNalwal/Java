package com.hello.linkedList;

public class LinkedList {

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        Node node = singlyLinkedList.createList(5);
        singlyLinkedList.printNodes();
//        Node node = singlyLinkedList.insertAtHead(55);
//        singlyLinkedList.printNodes(node);
//
//        singlyLinkedList.insertAtTail(77);
//        System.out.println();
//        singlyLinkedList.printNodes();
//        System.out.println();
//        System.out.println(singlyLinkedList.length());

//        singlyLinkedList.deleteAtHead();
//        singlyLinkedList.printNodes();
        System.out.println();
//        singlyLinkedList.deleteAtTail();
//        singlyLinkedList.printNodes();
        System.out.println();

//        singlyLinkedList.insertAtPosition(44, 4);
//        singlyLinkedList.printNodes();

//        singlyLinkedList.reversePrint();
//        singlyLinkedList.printNodes();

        int sum1 = singlyLinkedList.addList(node);
        int sum2 = singlyLinkedList.addList(node);
        System.out.println("List 1 + List 2 = "+(sum1 + sum2));
    }

}
