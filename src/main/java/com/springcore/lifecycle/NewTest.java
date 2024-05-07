package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NewTest {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		Example e1 = (Example) context.getBean("example");
		context.registerShutdownHook();
		System.out.println(e1);
	}

}
