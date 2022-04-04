package com.Solid;
public class SolidDemo
{
    public static void main(String[] args)
    {
        System.out.println("This section will implement the Solid principles");
        System.out.println("1: This is for SOLID's Single Responsibility=>");
        StudentDetails std=new StudentDetails();
        std.printDetails();
        System.out.println("2: This is for SOLID's Open for Extension and closed for modification=>");
        College c=new College();
        System.out.println("The department code is: "+c.departmentCode("CSE"));
        System.out.println("3: This is for SOLID's Liskov Substitution=>");
        Teacher t=new Teacher();
        t.setQuiz();
        System.out.println("4: This is for SOLID's Interface Segregation=>");
        RegistrarOffice rgo=new RegistrarOffice();
        rgo.feeUpdate();
        System.out.println("5: This is for SOLID's Dependency Inversion=>");
        BackEndDeveloper bed=new BackEndDeveloper();
        bed.writeJava();
    }
}
