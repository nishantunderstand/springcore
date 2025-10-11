package lifecycleByBean;

public class Samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Samosa(double price) {
		super();
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

	
	  // To Run You need to Assign inside config.xml file 
	  public void hey() {
	  System.out.println("Inside init Method");
	  System.out.println("Hey"); }
	  
	  public void bye() { 
		  System.out.println("Inside destroy Method");
	  System.out.println("Bye"); 
	  }
	 
	
	
	
}
