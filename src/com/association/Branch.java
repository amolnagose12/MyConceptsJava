package com.association;

public class Branch {
    private int bId;
    private String bLocation;

    public Branch(int bId, String bLocation) {
        this.bId = bId;
        this.bLocation = bLocation;
    }

    public Branch() {

    }

    public int getbId() {
        return bId;
    }

    public String getbLocation() {
        return bLocation;
    }
}
