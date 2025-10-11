package springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import a_springcore.Student;

public class SpringCoreTestMay28 {
	
	public SpringCoreTestMay28() {
		
	}
	
	public static void main(String[] args) {
		System.out.println("========= Hello World!=================");
		
		// ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/config.xml");
		// ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		
		
		Student student1 = (Student) context.getBean("student");
		System.out.println(student1.toString());
		
		System.out.println("Testing New Style of Coding");
		System.out.println("Testing the Style of TCS :=> ");
		
		((AbstractApplicationContext) context).close();
	}

	
}
