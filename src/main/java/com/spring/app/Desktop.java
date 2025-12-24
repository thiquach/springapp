package com.spring.app;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
    public Desktop() {
        System.out.println("Desktop created");
    }

    public void compile() {
        System.out.println("Desktop compile");
    }
}
