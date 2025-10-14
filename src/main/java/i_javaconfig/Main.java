package i_javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
/**
 * elated to Durgesh Yadav Spring Framework Series.
 * 28 Removing Complete XML for Spring Configuration _ @Configuration _ @Component_Full-HD
 * {@link }
 */
public class Main {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(JavaConfig.class);
		Student student = applicationContext.getBean("demo", Student.class);
		System.out.println(student);
		student.study();
		((AbstractApplicationContext) applicationContext).close();

	}

}
