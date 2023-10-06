package org.example.qtrtest.qtrtest;

public enum Size {


    SMALL("Small"),
    MEDIUM("Medium"),
    LARGE("Large");

    private String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    Size(String size) {
        this.size = size;
    }
}
