package com.springcore.ci.ambiguityProblem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext
				("com/springcore/ci/ambiguityProblem/ciconfig.xml");
		Addition add = (Addition) context.getBean("add");
		add.doSum();
	}
}


