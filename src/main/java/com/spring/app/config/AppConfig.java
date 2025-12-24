package com.spring.app.config;

import com.spring.app.Alien;
import com.spring.app.Computer;
import com.spring.app.Desktop;
import com.spring.app.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.spring.app")
public class AppConfig {

    // @ComponentScan of the package replaces the following @Bean
//    @Bean
//    public Alien alien(@Qualifier("laptop") @Autowired Computer com) {
//        Alien alien = new Alien();
////        alien.setAge(21);
//        alien.setCom(com);
//        return alien;
//    }
//
//    @Bean
//    public Desktop desktop() {
//        return new Desktop();
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop() {
//        return new Laptop();
//    }
}
