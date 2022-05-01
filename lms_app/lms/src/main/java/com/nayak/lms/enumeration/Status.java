package com.nayak.lms.enumeration;

public enum Status {
    PRESENT("PRESENT"),
    ABSENT("ABSENT");

    private final String status;

    Status(String status){
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
}
