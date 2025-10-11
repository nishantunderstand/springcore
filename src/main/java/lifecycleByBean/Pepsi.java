package lifecycleByBean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean {
	private double price;

	@Override
	public void afterPropertiesSet() throws Exception {		
		//init Functionality
		System.out.println("Taking Pepsit : init method");
		
	}

	@Override
	public void destroy() throws Exception {
		
		//destroy method
		System.out.println("Going to Bottle Back to Shop : destroy method");
		
	}
	
	public Pepsi() {
		super();

	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

}
