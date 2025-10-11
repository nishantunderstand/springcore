package lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * As you can see this, destroy method is not working.
 * That you need to update it to AbstractApplicationContext
 * And Use context.registerShutdownHook
 * {@link }
 */
public class NewTest {
	public static void main(String[] args) {

		ApplicationContext context = 
				new ClassPathXmlApplicationContext("lifecycle3/config.xml");
		Example e1 = (Example) context.getBean("example");
		System.out.println(e1);
		// ApplicationContext doesnot have context.registerShutDownHook();  //<--
		
		((AbstractApplicationContext) context).close();
	}

}
