package com.spring.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    @Value("25")
    private int age;
    private Computer com;

    public Alien() {
        System.out.println("Alien constructor - " + age);
    }

    public void code() {
        System.out.println("coding");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("set age " + age);
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }
}
