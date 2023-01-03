package com.bridgelabz;

import java.util.Scanner;

public class Static {
    private float pa;
    private float si;
    private float tp;
    private static float ri;
    static {
        ri = 2.5f;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle amount : " );
        pa = sc.nextFloat();
        System.out.println("Principle amt is : " + pa);

        System.out.println("Enter the time period :  " + tp);
        tp = sc.nextFloat();
        System.out.println("the time period is " + tp);

    }

    public void interestCalculation(){
        si = (pa*tp*ri)/100;


    }

   public void dis(){
       System.out.println("Simple interest is :: "  + si);
   }

    public static void main(String[] args) {
        Static st = new Static();
        st.input();
        st.interestCalculation();
        st.dis();

    }

}
