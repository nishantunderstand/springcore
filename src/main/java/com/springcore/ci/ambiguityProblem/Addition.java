package com.springcore.ci.ambiguityProblem;

public class Addition {
	private int a;
	private int b;
	
	// Parameterized Constructor
	
	/**
	 * If String Type is present, Then String will work
	 * If String is Not Present , Then Order will Top to Bottom. i.e.
	 * int in the below adjacent Case.
	 * 
	 */
	
	public Addition(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println("Constructor : int, int");
	}
	
	public Addition(double a,double b) {
		this.a=(int) a;
		this.b=(int) b;
		System.out.println("Constructor : double, double");
	}
	
	public Addition(String a, String b) {
		this.a =Integer.parseInt(a);
		this.b =Integer.parseInt(b);
		System.out.println("Constructor : String , String");
	}
	
	

	
	public void doSum()
	{
		System.out.println("Value of a: "+this.a);
		System.out.println("Value of b: "+this.b);
		System.out.println("Sum is" +": "+(this.a+ this.b));
	}
}
