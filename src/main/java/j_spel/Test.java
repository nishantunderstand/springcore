package j_spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
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
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spel-config.xml");
		DemoSpeL d1 = (DemoSpeL) context.getBean("demoSpeL");
		System.out.println(d1);
		
		SpelExpressionParser temp = new SpelExpressionParser();
		System.out.println("Spring Parser Output");
		Expression parseExpression = temp.parseExpression("22+44");
		
		System.out.println(parseExpression.getValue());
		
		((AbstractApplicationContext) context).close();
	}

}
