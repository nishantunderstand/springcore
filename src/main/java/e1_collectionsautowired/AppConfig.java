package e1_collectionsautowired;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


// @ComponentScan(basePackages = "e_collectionsautowired")
// What if We Comment ComponentScan ? Then how to run it ?
// Refer Below ?
// Can we Apply Regex ?? YESS 


/** GIVE UP FAILED SO BAD 
@ComponentScan(
    basePackages = "e",
    useDefaultFilters = false,
    includeFilters = @Filter(
        type = FilterType.REGEX,
        pattern = "e[0-9]*_collectionsautowired\\.Person"
    )
)
*/
@Configuration
@ComponentScan(basePackageClasses = Person.class)
public class AppConfig {

    @Bean
    public List<String> friends() {
        return new LinkedList<>(Arrays.asList("First", "Second", "Third", "Fourth", "Fifth", "Sixth"));
    }

    @Bean
    public Set<String> income() {
        return new HashSet<>(Arrays.asList("2999", "9000", "800"));
    }

    @Bean
    public Map<String, Integer> feestructure() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Spring Framework", 8000);
        map.put("Django Framework", 5000);
        map.put("Java Framework", 3000);
        map.put("C++ Framework", 2000);
        return map;
    }

    @Bean
    public Properties properties() {
        Properties props = new Properties();
        props.setProperty("driver", "com.mysql.jdbc.driver");
        props.setProperty("User", "Me");
        props.setProperty("Student", "Value");
        return props;
    }
}
