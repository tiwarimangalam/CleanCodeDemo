package com.SolidViolation;

public class College {
    public void department(String dpt) {
        if (dpt == "IT") {
            // For IT department we are going to perform the operations
            System.out.println("Perform the operation for IT department");
        } else if (dpt == "CSE") {
            // for CSE department we are going to perform the operations.
            System.out.println("Perform the operation for CSE department");
        }
        /* In This we are modifying the class as per need which means Violation of Open for extension
         and closed for modification.
         */
    }
}
