package com.springcore.standalone.collections.javaBased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Course courseBean() {
        return new Course("Spring Core - Java Based Config");
    }

    @Bean
    public Student studentBean() {
        return new Student(courseBean());
    }
}
