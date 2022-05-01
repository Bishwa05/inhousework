package com.nayak.lms.enumeration;

public enum Leave {
    APPROVE("APPROVE"),
    REJECT("REJECT");

    private final String leave;

    Leave(String leave){
        this.leave = leave;
    }

    public String getStatus() {
        return this.leave;
    }
}
