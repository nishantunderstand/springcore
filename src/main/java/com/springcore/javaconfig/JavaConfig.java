package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;


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
