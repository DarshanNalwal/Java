package com.hello.linkedList;

public class LinkedList {

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        Node node1 = singlyLinkedList.createList(5);
//        singlyLinkedList.insertAtHead(9);
//        singlyLinkedList.insertAtHead(2);
//        singlyLinkedList.insertAtHead(3);
        singlyLinkedList.printNodes();

        System.out.println("------------------");
        SinglyLinkedList singlyLinkedList2 = new SinglyLinkedList();
        Node node2 = singlyLinkedList2.createList(5);
        singlyLinkedList2.printNodes();

        Node node = singlyLinkedList.mergeLists(node1, node2);
        System.out.println("---------------");
        while (node!=null){
            System.out.print(node.val+ " ");
            node = node.next;
        }
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
//        System.out.println();
//        singlyLinkedList.deleteAtTail();
//        singlyLinkedList.printNodes();
//        System.out.println();

//        singlyLinkedList.insertAtPosition(44, 4);
//        singlyLinkedList.printNodes();

//        singlyLinkedList.reversePrint();
//        singlyLinkedList.printNodes();

//        int sum1 = singlyLinkedList.addList(node);
//        int sum2 = singlyLinkedList.addList(node);
//        System.out.println("List 1 + List 2 = "+(sum1 + sum2));
//        singlyLinkedList.addNumber(1);
//        singlyLinkedList.printNodes();
    }

}
