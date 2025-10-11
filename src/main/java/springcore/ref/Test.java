package springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = 
				new ClassPathXmlApplicationContext("springcore/ref/refconfig.xml");
		B b = (B) context.getBean("bref");
		System.out.println(b);

		A a = (A) context.getBean("aref");
		System.out.println(a);
		((AbstractApplicationContext) context).close();

	}

}
