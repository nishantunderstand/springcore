package k_sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("sterotype-config.xml");

		Student student = (Student) context.getBean("ob");
		System.out.println(student.getStudentName());
		System.out.println(student.getCity());
		System.out.println(student.getAddress());
		System.out.println(student.getClass().getName());
		System.out.println(student);
		Student student1 = (Student) context.getBean("ob");
		Student student2 = (Student) context.getBean("ob");
		Student student3 = (Student) context.getBean("ob");
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		System.out.println(student3.hashCode());
		((AbstractApplicationContext) context).close();

	}

}
