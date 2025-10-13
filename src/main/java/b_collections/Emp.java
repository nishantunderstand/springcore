package b_collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
	private String name;
	
	
	// Collection Framework Object
	private List<String> phones;
	private Set<String> address;
	private Map<String, String> courses;
	private Properties prop;

	public Set<String> getAddress() {
		return address;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public String getName() {
		return name;
	}

	public List<String> getPhones() {
		return phones;
	}

	public Properties getProp() {
		return prop;
	}

	public void setAddress(Set<String> address) {
		this.address = address;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", phones=" + phones + ", address=" + address + ", courses=" + courses + ", prop="
				+ prop + "]";
	}

}
