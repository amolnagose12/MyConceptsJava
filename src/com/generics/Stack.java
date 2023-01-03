package com.generics;

public class Stack {
    Node top;
    int size;

    class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(int data) {

        Node tempNode = new Node(data);
        tempNode.next = top;
        top = tempNode;
        size++;

    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }

        int result = top.data;
        top = top.next;
        size--;
        return result;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        return top.data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void displayStack() {
        Node current = top;

        while (current != null) {
            System.out.print(current.data + " ");

            current = current.next;
        }

    }
}
