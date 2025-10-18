package b_collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
	    //ApplicationContext context = new ClassPathXmlApplicationContext("collections/collectionconfig.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("config-collection.xml");
		Emp emp1 = (Emp) context.getBean("emp1");
		
		System.out.println(emp1);
		
		((AbstractApplicationContext) context).close();
	}

}

/**
You need to Update the Emp.java location in the config file as well.
*/
