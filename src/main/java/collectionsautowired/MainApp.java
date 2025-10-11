package collectionsautowired;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

//Sure! Here’s the complete code for Approach 1 (Component-Based with @Autowired):


public class MainApp {
    public static void main(String[] args) {
        System.out.println("//Sure! Here’s the complete code for Approach 1 (Component-Based with @Autowired):");
    	AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Person person = context.getBean(Person.class);

        System.out.println("Friends: " + person.getFriends());
        System.out.println("Income: " + person.getIncome());
        System.out.println("Fee Structure: " + person.getFeestructure());
        System.out.println("Properties: " + person.getProperties());
        context.close();
    }
}
