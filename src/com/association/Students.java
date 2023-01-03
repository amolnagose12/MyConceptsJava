package com.association;

public class Students {
    private int studentId;
    private String sName;
    private String sLastName;
    private Branch branch;

    public Students(int studentId, String sName, String sLastName, Branch branch) {
        this.studentId = studentId;
        this.sName = sName;
        this.sLastName = sLastName;
        this.branch = branch;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getsName() {
        return sName;
    }

    public String getsLastName() {
        return sLastName;
    }

    public Branch getBranch() {
        return branch;
    }

    public void dis(){
        System.out.println("=======================Student details Are==================== ");
        System.out.println(studentId);
        System.out.println(sName);
        System.out.println(sLastName);

        System.out.println("======================branch details are=======================");
        System.out.println(branch.getbId());
        System.out.println(branch.getbLocation());
    }
}
