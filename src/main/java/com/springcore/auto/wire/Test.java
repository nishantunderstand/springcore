package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/autoconfig.xml");
		// Emp emp1= (Emp) context.getBean("emp1"); // Approach 1
		Emp emp1 = context.getBean("emp1", Emp.class); // Approach 2
		System.out.println(emp1);
		System.out.println("emp1:" + emp1.hashCode());
		
		Emp emp2 = context.getBean("emp1", Emp.class);		
		System.out.println("emp2:" + emp2.hashCode());
		
		Emp emp3 = context.getBean("emp1", Emp.class);
		System.out.println("emp3:" + emp3.hashCode());
	}

}
