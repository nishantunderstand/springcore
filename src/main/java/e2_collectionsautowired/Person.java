package e2_collectionsautowired;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {

    private List<String> friends;
    private Set<String> income;
    private Map<String, Integer> feestructure;
    private Properties properties;

    // Constructor Injection
    public Person(List<String> friends, Set<String> income,
                  Map<String, Integer> feestructure, Properties properties) {
        this.friends = friends;
        this.income = income;
        this.feestructure = feestructure;
        this.properties = properties;
    }

    public List<String> getFriends() { return friends; }
    public Set<String> getIncome() { return income; }
    public Map<String, Integer> getFeestructure() { return feestructure; }
    public Properties getProperties() { return properties; }
}
