package com.springcore.a_core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// I Used this one When I was Studying From Durgesh
public class Test {
	public static void main(String[] args) {
		System.out.println("Hello World!");

    // Either you can pass Relative Address
		// Paste the config.xml in resources Folder 
		// It will Automatically read it.

    ApplicationContext context =
				new ClassPathXmlApplicationContext("springcore_config.xml");

    // This is way of creating Object of Student.
		// You can create as many object, as you want

    Student student1 = (Student) context.getBean("Student1");
		System.out.println(student1);
		
		Student student2 = (Student) context.getBean("Student2");
		System.out.println(student2);
		
		Student student3 = (Student) context.getBean("Student3");
		System.out.println(student3);
		
		Student student4 = (Student) context.getBean("Student4");
		System.out.println(student4);
		
		System.out.println("Testing New Style of Coding !!! Java Spring Core ");
		
		((AbstractApplicationContext) context).close();
	}
}
