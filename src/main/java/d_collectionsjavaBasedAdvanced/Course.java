package d_collectionsjavaBasedAdvanced;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Course {
    
    @Value(" Spring Core : By Annotation")
    private String courseName;


    public String getCourseName() {
        return courseName;
    }
}
