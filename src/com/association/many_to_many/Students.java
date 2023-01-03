package com.association.many_to_many;

public class Students {
    private Integer sId;
    private String name;

    private Cources[] cources;

    public Students(Integer sId, String name, Cources[] cources) {
        this.sId = sId;
        this.name = name;
        this.cources = cources;
    }

    public void dis(){
        System.out.println("===================Student details=============");
        System.out.println("Students id is :::: " + sId);
        System.out.println("Student name "+name);
        System.out.println("============cource details============");

        for (Cources cource:cources) {
            System.out.println(cource.getcId());
            System.out.println(cource.getcName());

        }
        System.out.println();
    }
}
