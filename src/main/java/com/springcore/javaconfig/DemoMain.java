package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(JavaConfig.class);
		Student student = applicationContext.getBean("demo", Student.class);
		System.out.println(student);
		student.study();
		

	}

}
