package com.datastructure;

import com.bridgelabz.Static;

public class Main {
    public static void main(String[] args) {
//        LinkedList ll = new LinkedList();
//        ll.insert(12);
//        ll.insert(50);
//        ll.insert(60);
//        ll.insert(20);
//        ll.insert(30);
//
////        ll.insertAtZero(90);
//        System.out.println("===================================");
////        ll.insterAtIndex(0,800);
//
//        ll.deleteAt(2);
//
//        ll.show();

        Stack stack = new Stack();
        System.out.println(stack.getSize());
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);
        stack.push(16);
        System.out.println(stack.getSize());

        System.out.println(stack.peak());

    }

}
