package com.SolidViolation;

public class StudentProject {
    /*
    In dependency inversion high level module shouldn't be dependent on low level module.
     */
    BackEndDeveloper bed = new BackEndDeveloper();
    FrontEndDeveloper fed = new FrontEndDeveloper();

    /*
    Here we are violating the dependency inversion principle because high level module StudentProject is dependent
    on low level module BackEndDeveloper and FrontEndDeveloper
     */
    public void implement() {
        bed.javaWrite();
        fed.javaScriptWrite();
    }
}
