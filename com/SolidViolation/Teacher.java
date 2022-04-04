package com.SolidViolation;

public class Teacher extends Quiz {
    @Override
    public void setQuiz() {
        System.out.println("Set the quiz for the evolution");
    }

    @Override
    public void attemptQuiz() {
        /*
        Here attemptQuiz() method isn't substitutable for base class.
         */
        System.out.println("Attempt the quiz for checking either it is working properly");
    }
}
