package springcore;

import springcore.a_core.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCoreTest {
	
	public SpringCoreTest() {
		
	}
	
	public static void main(String[] args) {
		System.out.println("========= Hello World!=================");
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/config.xml");
		// ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		
		// This is way of creating Object of Student.
		// You can create as many object, as you want
		
		Student student1 = (Student) context.getBean("Student1");
		System.out.println(student1);
		
		Student student2 = (Student) context.getBean("Student2");
		System.out.println(student2);
		
		Student student3 = (Student) context.getBean("Student3");
		System.out.println(student3);
		
		Student student4 = (Student) context.getBean("Student4");
		System.out.println(student4);
		
		System.out.println("Testing New Style of Coding");
		System.out.println("Testing the Style of TCS :=> ");
		((AbstractApplicationContext) context).close();
	}

	
}
