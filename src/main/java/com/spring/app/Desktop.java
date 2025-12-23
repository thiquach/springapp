package com.spring.app;

public class Desktop implements Computer {
    public Desktop() {
        System.out.println("Desktop created");
    }

    public void compile() {
        System.out.println("Desktop compile");
    }
}
