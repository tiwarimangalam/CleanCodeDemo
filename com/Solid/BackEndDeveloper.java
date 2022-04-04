package com.Solid;

public class BackEndDeveloper implements Developer {

    @Override
    public void develop() {
        this.writeJava();
    }

    public void writeJava() {
        System.out.println("Use Java for BackEndDevelopment");
    }
}
