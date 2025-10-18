package d_collectionsjavaBasedAdvanced;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
  // Final Keyword : Then You need to Define Constructor
  // Without Final : We can use it.
  @Autowired
  private Course course;


  public void display() {
    System.out.println("Enrolled in course: " + course.getCourseName());
  }
}
