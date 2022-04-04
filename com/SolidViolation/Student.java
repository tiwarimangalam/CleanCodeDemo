package com.SolidViolation;

public class Student {
    /*
    Single Responsibility Violation
     */
    public void printDetails() {
        System.out.println("Display the Student Details");
    }

    public void calculatePercentage() {
        System.out.println("Calculate the percentage of the students");
    }
    /*
    This is the violation of Single Responsibility principle.
    Because we are performing two functionality printDetails and calculatePercentage in a single class.
     */
}
