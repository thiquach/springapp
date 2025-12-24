package com.spring.app;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Laptop implements Computer {
    public Laptop() {
        System.out.println("Laptop created");
    }

    public void compile() {
        System.out.println("Laptop compile");
    }
}
