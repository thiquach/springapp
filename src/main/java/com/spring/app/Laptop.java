package com.spring.app;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public Laptop() {
        System.out.println("Laptop created");
    }

    public void compile() {
        System.out.println("Laptop compile");
    }
}
