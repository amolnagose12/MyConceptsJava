package com.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Integer> values = new ArrayList<Integer>();
//        values.add(20);
////        values.add("abc");



            Stack stack = new Stack();
            System.out.println(stack.size());
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40);
            stack.push(50);
            stack.push(60);

            System.out.println(stack.size());
            System.out.println(stack.isEmpty());

            System.out.println(stack.peek());
            System.out.println(stack.pop());

            System.out.println(stack.size());


    }

}
