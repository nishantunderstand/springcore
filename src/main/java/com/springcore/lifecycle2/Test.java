package com.springcore.lifecycle2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * When you duplicate the project,Always check the File location.
 * You can assign anything as init & destroy method.
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle2/config.xml");
		Samosa s1 = (Samosa) context.getBean("s1");
		System.out.println(s1);
		// registering shutdown hook
		context.registerShutdownHook();
		System.out.println("------------------------");

		Pepsi p1 = (Pepsi) context.getBean("p1");
		System.out.println(p1);

	}

}
