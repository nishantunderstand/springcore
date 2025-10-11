package springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
      "springcore/standalone/collections/aloneconfig.xml");

		Person person1 = (Person) context.getBean("person1");
		
		System.out.println("=== List ====");
		System.out.println(person1.getFriends());
		System.out.println(person1.getFriends().getClass());
		
		System.out.println("=== Set ====");
		System.out.println(person1.getIncome());
		System.out.println(person1.getIncome().getClass());
		
		System.out.println("=== Map ====");
		System.out.println(person1.getFeestructure());
		System.out.println(person1.getFeestructure().getClass());
		
		
		System.out.println("=== Properties ====");
		System.out.println(person1.getProperties());
		System.out.println(person1.getProperties().getClass());
		System.out.println("=== END ====");
		((AbstractApplicationContext) context).close();
	}

}

/*
 * Person person2 = (Person) context.getBean("person2");
 * System.out.println(person2); System.out.println(person2.getClass());
 * 
 * 
 * 
 */