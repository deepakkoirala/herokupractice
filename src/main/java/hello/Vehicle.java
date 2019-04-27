package hello;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Vehicle {

	@JsonProperty
	public String name;
	
	@JsonProperty
	public String age;

	Vehicle(){	
	}
	
	Vehicle(String name, String age){
		this.name = name;
		this.age = age;		
	}
	
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
