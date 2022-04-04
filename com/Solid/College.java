package com.Solid;

public class College implements Department {

    @Override
    public int departmentCode(String dpName) {
        if (dpName == "CS") {
            return 10;
        } else if (dpName == "IT") {
            return 5;
        } else {
            return 0;
        }
    }
}
