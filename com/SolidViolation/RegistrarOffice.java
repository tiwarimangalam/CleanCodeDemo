package com.SolidViolation;

public class RegistrarOffice implements Update {

    @Override
    public void feeUpdate() {
        System.out.println("Update the fee details");
    }

    @Override

    public void contactDetailsUpdate() {
        System.out.println("Can't update the fee details");
        /*
        Here is the violation of interface segregation.
        because RegistrarOffice not need to Update the contact details.
         */
    }

    @Override
    public void attendanceUpdate() {
        System.out.println("Update the attendance");
    }
}
