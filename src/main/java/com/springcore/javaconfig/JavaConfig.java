package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


public class JavaConfig {
	
	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
	
	@Bean(name = {"student","temp","demo"})
	public Student getStudent() {
		//return type Student
		//Creating New Student Object
		Student student = new Student(getSamosa());
		return student;
		
	}

}
