package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * elated to Durgesh Yadav Spring Framework Series.
 * 28 Removing Complete XML for Spring Configuration _ @Configuration _ @Component_Full-HD
 * {@link }
 */
public class DemoMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(JavaConfig.class);
		Student student = applicationContext.getBean("demo", Student.class);
		System.out.println(student);
		student.study();
		

	}

}
