package com.Solid;

public class RegistrarOffice implements FeeAndAttendance {

    @Override
    public void feeUpdate() {
        System.out.println("Update the fee details");
    }

    @Override
    public void attendanceUpdate() {
        System.out.println("update the attendance");
    }
}
