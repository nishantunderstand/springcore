package com.springcore.lifecycle3;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Example() {
		super();
		
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Starting Method Annotation Method: init Method");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Ending Method Annotation Method: destroy Method");
	}
}
