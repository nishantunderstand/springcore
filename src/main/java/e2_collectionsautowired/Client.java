package e2_collectionsautowired;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Person person = context.getBean(Person.class);

        System.out.println("Friends: " + person.getFriends());
        System.out.println("Income: " + person.getIncome());
        System.out.println("Fee Structure: " + person.getFeestructure());
        System.out.println("Properties: " + person.getProperties());

        context.close();
    }
}
