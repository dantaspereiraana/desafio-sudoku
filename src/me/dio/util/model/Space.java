package me.dio.util.model;

public class Space {
    Integer actualNumber;
    private final boolean fixed;
    private final int expectedNumber;


    public Space(boolean fixed, int expectedNumber) {
        this.fixed = fixed;
        this.expectedNumber = expectedNumber;
        if (fixed){
            actualNumber = expectedNumber;
        }
    }


    public void setActualNumber(final Integer actualNumber) {
        if(fixed) return;
        this.actualNumber = actualNumber;
    }

    public void clearSpace(){
        setActualNumber(null);
    }

    public Integer getActualNumber() {
        return actualNumber;
    }

    public boolean isFixed() {
        return fixed;
    }

    public int getExpectedNumber() {
        return expectedNumber;
    }
}
