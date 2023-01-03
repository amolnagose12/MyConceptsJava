package com.bridgelabz;

public class MutableString {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Sachin");
        sb.append("India");
        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1.capacity());

    }
}
