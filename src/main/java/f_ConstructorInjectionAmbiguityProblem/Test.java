package f_ConstructorInjectionAmbiguityProblem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ciconfigambiguity.xml");

		Addition add = (Addition) context.getBean("add");
		add.doSum();
		((AbstractApplicationContext) context).close();
	}
}
