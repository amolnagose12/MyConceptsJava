package com.association.many_to_many;

public class Cources {
    private Integer cId;
    private String cName;

    public Integer getcId() {
        return cId;
    }

    public String getcName() {
        return cName;
    }

    public Cources(Integer cId, String cName) {
        this.cId = cId;
        this.cName = cName;
    }
}
