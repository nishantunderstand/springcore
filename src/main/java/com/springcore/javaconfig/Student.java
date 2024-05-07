package com.springcore.javaconfig;

public class Student {
	
	private Samosa samosa;
	public Samosa getSamosa() {
		return samosa;
	}
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}
	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}
	public void study() {
		samosa.display();
		System.out.println("Student is reading book");
	}

}
