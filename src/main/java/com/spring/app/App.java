package com.spring.app;

import com.spring.app.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args ) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Desktop desk = context.getBean("desktop", Desktop.class);
        desk.compile();
        //        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Alien alien = (Alien) context.getBean("alien");
//        alien.code();
//
//        Desktop desk = context.getBean("com2", Desktop.class);
//        desk.compile();
//
//        Computer com = context.getBean(Laptop.class);
//        com.compile();
//
//        Computer obj1 = context.getBean(Desktop.class);
    }
}
