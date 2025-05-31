package com.springcore.standalone.collections.javaBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
    	System.out.println("Approach 2: Java-Based Configuration using @Bean");
        
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
    	Student student = context.getBean("studentBean", Student.class);
        
    	student.display();
    }
}
