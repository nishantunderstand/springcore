package springcore.ci;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestWithTryAutocloseable {

	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("ciconfig.xml")) {
			
			Person p = (Person) ctx.getBean("person");
			System.out.println(p);
		} 
	}
}


/**


public static void main(String[] args) {
		try(ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("ciconfig.xml")) {
			
			Person p = (Person) ctx.getBean("person");
			System.out.println(p);
		} 
	}

-- Wrong as ApplicationContext Don't Implement AutoCloseable

*/