package com.Solid;

/*
Here we have removed the dependency of High level module on low level module.
 */
public class FrontEndDeveloper implements Developer {

    @Override
    public void develop() {
        this.writeJavaScript();
    }

    public void writeJavaScript() {
        System.out.println("Use JavaScript for FrontEndDevelopment");
    }
}
