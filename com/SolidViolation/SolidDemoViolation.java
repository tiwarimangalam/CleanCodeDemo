package com.SolidViolation;

public class SolidDemoViolation
{
    public static void main(String[] args)
    {
        System.out.println("This Section will be related to solid principles violation");
        System.out.println("1: This is for SOLID's Single Responsibility Violation=>");
        Student st=new Student();
        st.printDetails();
        System.out.println("2: This is for SOLID's open for extension and closed for modification Violation=>");
        College c=new College();
        c.department("IT");
        System.out.println("3: This is for SOLID's Liskov Substitution Violation=>");
        Quiz q=new Students();
        q.setQuiz();
        System.out.println("4: This is for SOLID's Interface Segregation Violation=>");
        RegistrarOffice ro=new RegistrarOffice();
        ro.contactDetailsUpdate();
        System.out.println("5: This is for SOLID's Dependency Inversion Violation=>");
        BackEndDeveloper bed=new BackEndDeveloper();
        bed.javaWrite();
    }
}

