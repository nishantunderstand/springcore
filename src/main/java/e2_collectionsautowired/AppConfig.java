package e2_collectionsautowired;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public List<String> friends() {
        return Arrays.asList("First", "Second", "Third", "Fourth", "Fifth", "Sixth");
    }

    @Bean
    public Set<String> income() {
        return Set.of("2999", "9000", "800");
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

    // Person bean defined here
    @Bean
    public Person person(List<String> friends, Set<String> income,
                         Map<String, Integer> feestructure, Properties properties) {
        return new Person(friends, income, feestructure, properties);
    }
}
