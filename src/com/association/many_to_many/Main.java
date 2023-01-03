package com.association.many_to_many;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Cources c1 = new Cources(123,"Java");
        Cources c2 = new Cources(456,"Python");
        Cources c3 = new Cources(987,"JavaScript");

        Cources[] cources1 = new Cources[2];
        cources1[0]=c1;
        cources1[1]=c2;

        Cources[] cources2 = new Cources[3];
        cources2[0] = c1;
        cources2[1] = c2;
        cources2[2] = c3;

        Students s1 = new Students(12,"Don",cources1);
        Students s2 = new Students(123,"Boss",cources2);

        s1.dis();
        s2.dis();

    }
}
