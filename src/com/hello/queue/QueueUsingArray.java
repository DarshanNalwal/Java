package com.hello.queue;

public class QueueUsingArray {

    int[] a;
    int front;
    int rear;
    int capacity;

    QueueUsingArray(int capacity) {
        this.capacity = capacity;
        this.a = new int[capacity];
        front = rear = -1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return (rear + 1) % capacity == front;
    }

    public int size() {
        return (capacity - front + rear + 1) % capacity;
    }

    public void enqueue(int data) {
        if(isFull()) {
            throw new RuntimeException("Queue Overflow");
        } else {
            rear = (rear + 1) % capacity;
            a[rear] = data;
            if(front == -1)
                front = rear;
        }
    }

    public int dequeue() {
        if(isEmpty()) {
            throw new RuntimeException("Queue Underflow");
        } else {
            int temp = a[front];
            if(rear == front) {
                front = rear = -1;
            } else {
                front = (front + 1) % capacity;
            }

            return temp;
        }
    }

    public static void main(String[] args) {

    }


}
