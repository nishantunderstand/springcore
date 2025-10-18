package d_collectionsjavaBasedAdvanced;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Client {
    public static void main(String[] args) {
    	System.out.println(" ========== Approach 3: Java-Based Configuration using @Bean =========== ");
        
    	AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);        
    	Student student = context.getBean(Student.class);        
    	student.display();
    	context.close();
    }
}
