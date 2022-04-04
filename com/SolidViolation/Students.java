package com.SolidViolation;

public class Students extends Quiz {

    @Override
    public void setQuiz() {
        System.out.println("Can't set the quiz");
    }

    @Override
    public void attemptQuiz() {
        System.out.println("Attempt the quiz");
    }
}
