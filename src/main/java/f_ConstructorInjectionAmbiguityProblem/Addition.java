package f_ConstructorInjectionAmbiguityProblem;

public class Addition {
	private int a;
	private int b;
	
	// Parameterized Constructor
	
	/**
	 	1. If String Type is present, Then String will work
		2. If String Type is Not Present ,
		 		Then Order will Top to Bottom. i.e. int in the below adjacent Case.
		
		
		============================================
		
		We can resolve this issue by  :
		1. Specify the type  => type="double" 
		2. Specify the index => index="1"
	 */
	
	
	
	public Addition(String a, String b) {
		this.a =Integer.parseInt(a);
		this.b =Integer.parseInt(b);
		System.out.println("Constructor : String , String");
	}
	
	
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
	
	/**
	public Addition(String a, String b) {
		this.a =Integer.parseInt(a);
		this.b =Integer.parseInt(b);
		System.out.println("Constructor : String , String");
	}
	*/
		
	public void doSum()
	{
		System.out.println("Value of a: "+this.a);
		System.out.println("Value of b: "+this.b);
		System.out.println("Sum is" +": "+(this.a+ this.b));
	}
}
