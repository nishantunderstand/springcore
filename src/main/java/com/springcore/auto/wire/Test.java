package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
		/**
		 * What is hashCode Or equals ? Difference B/w them
		 */
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/springcore/auto/wire/autoconfig.xml");
		// Emp emp1= (Emp) context.getBean("emp1"); // Approach 1
		Emp emp1 = context.getBean("emp1", Emp.class); 
			// Approach 2 , Here we are using Overloaded, Whatever is passed, It's become its return type. 
		// Here we don't need Cast Operator ? Question is why ?
		System.out.println(emp1);
		System.out.println("emp1:" + emp1.hashCode());
		
		Emp emp2 = (Emp) context.getBean("emp1");		
		System.out.println("emp2:" + emp2.hashCode());
		
		Emp emp3 = context.getBean("emp1", Emp.class);
		System.out.println("emp3:" + emp3.hashCode());
		
		// In autoconfig.xml, I declared only 1 Bean.
		// Here, i am testing the concept of hashode.
		
		((AbstractApplicationContext) context).close();
	}

}
