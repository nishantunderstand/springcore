package a_springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
  public static void main(String[] args) {
    ApplicationContext context =
      new ClassPathXmlApplicationContext("springcore_config.xml");
    Student st1 = (Student) context.getBean("Student1");
    System.out.println(st1);
  }
}
