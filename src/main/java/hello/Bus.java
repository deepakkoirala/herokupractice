package hello;

//import com.fasterxml.jackson.annotation.JsonProperty;

public class Bus extends Vehicle{

//	@JsonProperty
	private String wheels;
	
	Bus(){		
	}
	
	Bus(String name, String age, String wheels) {
		super(name, age);
		this.wheels = wheels;
	}

	public String getWheels() {
		return wheels;
	}

	public void setWheels(String wheels) {
		this.wheels = wheels;
	}
	
}
