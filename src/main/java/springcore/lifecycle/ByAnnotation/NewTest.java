package springcore.lifecycle.ByAnnotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NewTest {

	public static void main(String[] args) {

		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("springcore/lifecycle/ByAnnotation/config.xml");
		System.out.println("=== By Annotation === \n 1 Update XML Path \n 2 XML Package Name");
		Example e1 = (Example) context.getBean("example");
		context.registerShutdownHook();
		System.out.println(e1);
		context.close();
	}

}

/**
 * Whether you use Annotation or XML based Configuration.
 * In both case, I need to use context.registerShutdownHook.
 */