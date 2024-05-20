package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;
 */
public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/config.xml");
		Demo d1 = (Demo) context.getBean("demo");
		System.out.println(d1);
		SpelExpressionParser temp = new SpelExpressionParser();
		System.out.println("Spring Parser Output");
		Expression parseExpression = temp.parseExpression("22+44");
		System.out.println(parseExpression.getValue());
	}

}
