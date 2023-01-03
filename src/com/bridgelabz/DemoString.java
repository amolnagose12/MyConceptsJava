package com.bridgelabz;

public class DemoString {
    String name = "Amol" + 10 +10 +20;


    public static void main(String[] args) {
       String s1 = "Amol";
       String s2 = "Nagose";
       String s3 = "Someshwar";

       String s4 = "Amol" + "Nagose";
       String s5 = s1 + s2;


        System.out.println(s4);
        System.out.println(s5);

        System.out.println(s4==s5);

    }
}
