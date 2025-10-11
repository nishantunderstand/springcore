package com.springcore.a_core;

// This is acting as 
// Is this a POJO or JavaBean ? POJO
public class Student {
	private int studentId;
	private String studentName;
	private String studentAddress;
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		//System.out.println("Setting StudentId");
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		//System.out.println("Setting StudentName");
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		//System.out.println("Setting StudentAddress");
		this.studentAddress = studentAddress;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}

	

}
