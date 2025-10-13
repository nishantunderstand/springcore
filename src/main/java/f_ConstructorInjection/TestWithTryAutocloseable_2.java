package f_ConstructorInjection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestWithTryAutocloseable_2 {
    // Working
	public static void main(String[] args) {
		try(AbstractApplicationContext ctx = 
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
-- Try AbstractApplicationContext
*/