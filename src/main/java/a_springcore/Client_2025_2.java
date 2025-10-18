package a_springcore;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Either Test or Client
public class Client_2025_2 {

    public static void main(String[] args) {
        AbstractApplicationContext ctx
                = new ClassPathXmlApplicationContext("springcore-config.xml");
        Student st1 = (Student) ctx.getBean("Student1");
        System.out.println(st1);
        ctx.close();
    }
}
