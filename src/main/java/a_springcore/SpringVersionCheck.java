package a_springcore;

import org.springframework.boot.SpringBootVersion;
import org.springframework.core.SpringVersion;

public class SpringVersionCheck {
    public static void main(String[] args) {
        System.out.println("===== Version Info =====");
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Spring Framework Version: " + SpringVersion.getVersion());
        // System.out.println("Spring Boot Version: " + SpringBootVersion.getVersion()); 
        // Getting Error , As My Project is Spring Core not Spring Boot
    }
}