package com.datastructure;

public class Stack {
    Node head;
    int size;
    int data;

    public Stack(){
        head = null;
        size = 0;
    }



    public void push(int data){
        Node temp = new Node();
            temp.next = head;
            size++;
            head = temp;
    }
    public int peak(){
        if (head == null){
            System.out.println("stack is empty");
        }
        return head.data;
    }

    public int pop(){
        if (head == null){
            System.out.println("Stack is null");
        }
        int result = head.data;
        head = head.next;
        size--;
        return result;
    }
    public void dis(){
        Node node = head;
        while (node != null){
            System.out.println(node.data);
            node = node.next;
        }

    }

    int getSize(){
        return size;
    }
}
