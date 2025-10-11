package springcore.standalone.collections.javaBased;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainApp {
    public static void main(String[] args) {
    	System.out.println("Approach 2: Java-Based Configuration using @Bean");
        
    	AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
    	Student student = context.getBean("studentBean", Student.class);
        
    	student.display();
    	context.close();
    }
}
