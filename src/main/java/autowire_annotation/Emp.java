package autowire_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	@Autowired
	//By Property
	@Qualifier("address1")
	private Address address;

	public Address getAddress() {
		return address;
	}
	
	//By Setter
	public void setAddress(Address address) {
		System.out.println("Setting Value");
		this.address = address;
	}

	public Emp() {
		super();
		
	}
	
	//By Constructor
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("Inside Constructor");
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	

}
