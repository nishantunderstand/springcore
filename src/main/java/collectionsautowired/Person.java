package collectionsautowired;



import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    @Autowired
    private List<String> friends;

    @Autowired
    private Set<String> income;

    @Autowired
    private Map<String, Integer> feestructure;

    @Autowired
    private Properties properties;

    // Getters (optional)
    public List<String> getFriends() {
        return friends;
    }

    public Set<String> getIncome() {
        return income;
    }

    public Map<String, Integer> getFeestructure() {
        return feestructure;
    }

    public Properties getProperties() {
        return properties;
    }
}
