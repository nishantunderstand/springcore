package com.springcore;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

    private ApplicationContext context;

    @BeforeEach
    public void setup() {
        context = new ClassPathXmlApplicationContext("config.xml");
    }

    @Test
    public void testStudentBeanLoaded() {
        Student student = (Student) context.getBean("Student1");
        assertNotNull(student);
        assertEquals(1, student.getStudentId());
        assertEquals("Alice", student.getStudentName());
        assertEquals("Delhi", student.getStudentAddress());
    }

    @Test
    public void testStudentToString() {
        Student student = (Student) context.getBean("Student1");
        String expected = "Student [studentId=1, studentName=Alice, studentAddress=Delhi]";
        assertEquals(expected, student.toString());
    }
}
