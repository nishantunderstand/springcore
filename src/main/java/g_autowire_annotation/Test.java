package g_autowire_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
	    ApplicationContext context = new ClassPathXmlApplicationContext("g_autowire_annotation/autoconfig.xml");
		ApplicationContext context1 = new ClassPathXmlApplicationContext("/g_autowire_annotation/autoconfig.xml");
		// Emp emp1= (Emp) context.getBean("emp1");
		Emp emp1 = context.getBean("emp1", Emp.class);
		System.out.println(emp1);
		((AbstractApplicationContext) context).close();
	}

}
