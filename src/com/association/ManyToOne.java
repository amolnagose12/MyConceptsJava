package com.association;

public class ManyToOne {
    public static void main(String[] args) {
        Branch branch = new Branch(123,"Nagpur");

        Students students = new Students(123,"Amol","Nagose",branch);
        Students students1= new Students(123457,"Pratik","Nagose",branch);
        students.dis();
        students1.dis();
    }
}
